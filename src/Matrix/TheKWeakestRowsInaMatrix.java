package Matrix;

import java.util.*;
import java.util.stream.Collectors;

public class TheKWeakestRowsInaMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(kWeakestRows(new int[][] {{1,1,0,0,0},
                                                                    {1,1,1,1,0},
                                                                    {1,0,0,0,0},
                                                                    {1,1,0,0,0},
                                                                    {1,1,1,1,1}}, 3)));  //[2, 0, 3]

        System.out.println(Arrays.toString(kWeakestRows2(new int[][] {{1,1,0,0,0},
                                                                    {1,1,1,1,0},
                                                                    {1,0,0,0,0},
                                                                    {1,1,0,0,0},
                                                                    {1,1,1,1,1}}, 3)));  //[2, 0, 3]
    }

    //brute force solution using HashMap and stream
    public static int[] kWeakestRows(int[][] mat, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< mat.length; i++){
            int count = 0;
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] == 1)
                    count++;
            }
            map.put(i, count);
        }

        //sorting "map" by value, and save them into "temp"
        HashMap<Integer, Integer> temp = map.entrySet()
                .stream()
                .sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)-> e1, LinkedHashMap::new));
        int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()){
            if (i < k){
                result[i++] = entry.getKey();
            } else
                break;
        }
        return result;
    }

    public static int[] kWeakestRows2(int[][] mat, int k) {

        int[] count = new int[mat.length];
        int[] result = new int[k];

        for (int i=0; i< mat.length; i++){
            int soldiers = 0;
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] == 1)
                    soldiers++;
            }
            count[i] = soldiers * 1000 + i; // will use it to get index after sorting the array
        }
        Arrays.sort(count);
        for (int i=0; i<k; i++){
            result[i] = count[i] % 1000; // getting index
        }
        return result;
    }
}
