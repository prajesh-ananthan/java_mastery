package com.java.mastery.generics.journaldev.unboundedwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prajesh Ananthan
 *         Created on 5/8/2017.
 */
public class UnboundedWildCard {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    int sum = printData(list);
    System.out.println(sum);
  }

  private static int printData(List<?> list) {
    int sum = 0;
    for (Object obj : list) {
      if (obj instanceof Integer) {
        sum += (int) obj;
      }
    }
    return sum;
  }
}
