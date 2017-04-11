package com.java.mastery.method_references;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 11/4/2017.
 *         <p>
 *         Newly used methods in Java 8:
 *         1) putIFAbsent() pg. 156
 *         2) merge pg. 157
 *         3) computeIfPreseent pg. 158
 *         4) computeIfAbsent pg. 159
 */
public class HashMapMethods {
  public static void main(String[] args) {
//    putIfAbsent();
//    mergeFunction();
//    mapComputeIfPresent();
//    mapComputeIfAbsent();
  }

  private static void putIfAbsent() {
    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");
    favorites.put("Jenny", "Tram");
    favorites.put("Tom", null);

    favorites.putIfAbsent("Jenny", "Tram");
    favorites.putIfAbsent("Sam", "Tram");
    favorites.putIfAbsent("Tom", "Tram");

    System.out.println(favorites);
  }

  /**
   * Returns the name with the longest name
   */
  private static void mergeFunction() {
    Map<String, String> favorites = new HashMap<>();
    favorites.put("Jenny", "Bus Tour");
    favorites.put("Tom", "Tram");

    BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

    String jenny = favorites.merge("Jenny", "Bus Tour", mapper);
    String tom = favorites.merge("Tom", "Tram", mapper);

    System.out.println(jenny);
    System.out.println(tom);
  }

  private static void mapComputeIfPresent() {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 1);

    BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;

    Integer jenny = counts.computeIfPresent("Jenny", mapper);
    Integer tom = counts.computeIfPresent("tom", mapper);
    System.out.println(jenny);
    System.out.println(tom);
  }

  private static void mapComputeIfAbsent() {
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Jenny", 1);
    counts.put("Tom", null);

    Function<String, Integer> count = k -> 1;

    Integer tom = counts.computeIfAbsent("Tom", count);
    System.out.println(tom);
  }
}
