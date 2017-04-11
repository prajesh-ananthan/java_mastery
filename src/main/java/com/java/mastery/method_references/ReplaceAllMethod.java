package com.java.mastery.method_references;

import java.util.Arrays;
import java.util.List;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 11/4/2017.
 *         <p>
 *         pg. 155 OCJP
 */
public class ReplaceAllMethod {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3);
    list.replaceAll(x -> x * 2);
    System.out.println(list);
  }
}
