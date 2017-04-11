package com.java.mastery.method_references;

import java.util.Arrays;
import java.util.List;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 11/4/2017.
 */
public class ForEachMethod {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Prajesh", "Usha", "Ananthan");
    names.forEach(s -> System.out.println(s));
    names.forEach(System.out::print);
  }
}
