package com.java.mastery.generics.journaldev.upperboundedwildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prajesh Ananthan
 *         Created on 5/8/2017.
 *
 *
 *         Now the problem with above implementation is that it won’t work with List of Integers
 *         or Doubles because we know that List<Integer> and List<Double> are not related, this is
 *         when upper bounded wildcard is helpful. We use generics wildcard with extends keyword and the upper
 *         bound class or interface that will allow us to pass argument of upper bound or it’s subclasses types.
 */
public class UpperBoundedWildCard {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    double sum = sumWithUpperBoundWildCard(list);
    System.out.println(sum);
  }

  public static double sum(List<Number> list) {
    double sum = 0;
    for (Number n : list) {
      sum += n.doubleValue();
    }
    return sum;
  }

  public static double sumWithUpperBoundWildCard(List<? extends Number> list) {
    double sum = 0;
    for (Number n : list) {
      sum += n.doubleValue();
    }
    return sum;
  }

}
