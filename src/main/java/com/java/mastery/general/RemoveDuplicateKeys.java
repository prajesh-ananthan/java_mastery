package com.java.mastery.general;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANAN011 on 6/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Remove duplicate keys from HashMap
 */
public class RemoveDuplicateKeys {
  public static void main(String[] args) {
    Map<String, String> map1 = new HashMap<>();
    map1.put("1", "one");
    map1.put("2", "two");
    map1.put("3", "three");
    map1.put("4", "four");
    map1.put("5", "five");

    Map<String, String> map2 = new HashMap<>();
    map2.put("4", "four");
    map2.put("5", "five");

    // Removes keys already exist in the other map
    Map<String, String> deleteMap = new HashMap<>(map1);
    deleteMap.keySet().removeAll(map2.keySet());

    //Iterate over keys inside hash
    for (String key : deleteMap.keySet()) {
      System.out.println(key);
    }
  }
}
