package com.java.mastery.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ANAN011 on 1/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Main241 {
  public static void main(String[] args) {
    printInfiniteRandomNumbers();
  }

  private static void countStreamValues() {
    List<String> list = Arrays.asList("a", "b", "c");
    Stream<String> fromList = list.stream();
    System.out.println(fromList.count());
  }

  private static void printInfiniteRandomNumbers() {
    Stream<Double> randoms = Stream.generate(() -> Math.random());
    randoms.forEach(System.out::println);
  }
}
