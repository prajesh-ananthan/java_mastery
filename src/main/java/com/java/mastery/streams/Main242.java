package com.java.mastery.streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by ANAN011 on 1/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         <p>
 *         Using min() and max() terminal operators in Stream
 */
public class Main242 {
  public static void main(String args[]) {
    printStringMinLength();
    emptyStream();
  }

  private static void printStringMinLength() {
    Stream<String> s = Stream.of("monkey", "ape", "baboon");
    Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
    min.ifPresent(System.out::println);
  }

  private static void emptyStream() {
    Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
    minEmpty.ifPresent(System.out::println);
  }
}
