package com.java.mastery.generics.journaldev.lowerboundedwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prajesh Ananthan
 *         Created on 5/8/2017.
 */
public class LowerBoundedWildCard {
  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();
    sum(list);

  }

  private static void sum(List<? super Number> list) {
    list.add(new Integer(20));
    System.out.println(list);
  }
}