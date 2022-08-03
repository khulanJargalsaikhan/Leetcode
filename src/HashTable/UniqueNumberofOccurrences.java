package HashTable;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[] {1,2}));
        System.out.println(uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        //Finding the number of occurrences of each element in the array using a hash map.
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1 );
        }
        //System.out.println(map);
        //Iterate through the hash map and check if there is a repeated value
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (!set.add(entry.getValue())){
                return false;
            }
        }
        return true;
    }
}
