package com.java.mastery.generics.bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAN011 on 14/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *
 * Use of UpperBoundWildCards pg. 119
 */
public class UpperBoundWildCards {
  List<? extends Number> list = new ArrayList<Integer>();

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    total(list);
  }

  private static int total(List<? extends Number> list) {
    int count = 0;
    for (Number number : list) {
      count += number.intValue();
      System.out.println(count);
    }
    return count;
  }
}
