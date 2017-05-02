package com.java.mastery.streams;

import java.util.stream.Stream;

/**
 * Created by ANAN011 on 1/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Main288 {
  public static void main(String[] args) {
    Stream<String> empty = Stream.empty();
    System.out.println(empty.count());

    Stream<Integer> notEmpty = Stream.of(1, 2, 3);
    System.out.println(notEmpty.count());
  }
}
