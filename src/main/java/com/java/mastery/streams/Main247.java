package com.java.mastery.streams;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ANAN011 on 2/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Using the collect() reduction
 */
public class Main247 {
  public static void main(String[] args) {
    withoutCollectorInterface();
    withCollectorInterface();
  }

  private static void withoutCollectorInterface() {
    Stream<String> stream = Stream.of("W", "O", "L", "F");
    //collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
    TreeSet<String> word = stream.collect(
        TreeSet::new,
        TreeSet::add,
        TreeSet::addAll
    );
    System.out.println(word);
  }

  private static void withCollectorInterface() {
    Stream<String> stream = Stream.of("W", "O", "L", "F");
    Set<String> word = stream.collect(Collectors.toSet());
    System.out.println(word);
  }
}
