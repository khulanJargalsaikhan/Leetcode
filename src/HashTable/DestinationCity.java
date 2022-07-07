package HashTable;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args){
        System.out.println(destCity(Arrays.asList(
                                            Arrays.asList("B","C"),
                                            Arrays.asList("D","B"),
                                            Arrays.asList("C","A") )));
        System.out.println(destCity(Arrays.asList(
                                            Arrays.asList("London","New York"),
                                            Arrays.asList("New York","Lima"),
                                            Arrays.asList("Lima","Sao Paulo") )));
    }
    //Leetcode #1436
    public static String destCity(List<List<String>> paths) {
        Set<String> entryCities = new HashSet<>();
        Set<String> destCities = new HashSet<>();
        String target = "";

        for(List<String> city : paths){
            //save all entry cities
            entryCities.add(city.get(0));
            //save all destination cities
            destCities.add(city.get(1));
        }
        //loop through dest cities to find which city is not in the entry cities, that will be the target city
        for(String targetCity : destCities){
            if (!entryCities.contains(targetCity))
                target = targetCity;

        }
        return target;
    }
}
