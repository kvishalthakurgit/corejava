package com;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
 
public class Java8MapSortingByValueExamples {
 
  public static void main(String[] args) {
    System.out.println("\nSorting using Java8 streams\n");
     
    sortByValueJava8Stream();
  }
 
  private static void sortByValueJava8Stream() 
  {
    Map<String, Integer> unSortedMap = getUnSortedMap();
     
    System.out.println("Unsorted Map : " + unSortedMap);
    Map<String, Integer> sortedMap = new LinkedHashMap<>();

    //comparingByValue
    unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
        .forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
     
    System.out.println("Sorted Map   : " + sortedMap);
     
    //Comparator.reverseOrder()
    LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
    unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
    
    //
    unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
    collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(k,v)->k, ()->new LinkedHashMap<>()));
    
    //
    LinkedHashMap<String, Integer> collect = unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
    collect(Collectors.toMap(Map.Entry::getKey, e->e.getValue(),(k,v)->k, LinkedHashMap :: new ));
     
    System.out.println("Reverse Sorted Map   : " + reverseSortedMap);
    
  }
 
  private static Map<String, Integer> getUnSortedMap() 
  {
    Map<String, Integer> unsortMap = new HashMap<>();
    unsortMap.put("alex", 1);
    unsortMap.put("david", 2);
    unsortMap.put("elle", 3);
    unsortMap.put("charles", 4);
    unsortMap.put("brian", 5);
    return unsortMap;
  }
}

