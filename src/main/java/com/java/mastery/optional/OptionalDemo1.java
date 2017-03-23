package com.java.mastery.optional;

import java.util.Optional;

/**
 * Created by ANAN011 on 23/3/2017.
 */
public class OptionalDemo1 {
  public static void main(String[] args) {
    Integer value1 = null;
    Integer value2 = 10;

    Optional<Integer> a = Optional.ofNullable(value1);
    Optional<Integer> b = Optional.of(value2);
    OptionalDemo1.sum(a, b);
  }

  private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
    System.out.println("First parameter is present " + a.isPresent());
    System.out.println("Second parameter is present " + b.isPresent());

    Integer value1 = a.orElse(0);
    System.out.println("Value: " + value1);

    Integer value2 = b.get();
    return value1 + value2;
  }
}
