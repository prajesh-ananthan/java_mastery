package com.java.mastery.streams;

import java.util.stream.Stream;

/**
 * Created by ANAN011 on 1/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         a forEach() terminal operation example
 */
public class Main244 {
  public static void main(String[] args) {
    printEachStreamElement();
  }

  private static void printEachStreamElement() {
    Stream<String> stream = Stream.of("Monkey", "Gorilla", "Orang Utan");
    stream.forEach(System.out::println);
  }
}
