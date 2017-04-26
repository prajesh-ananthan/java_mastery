package com.java.mastery.for_each;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAN011 on 23/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Source: http://www.mkyong.com/java8/java-8-foreach-examples/
 */
public class Exercise1 {
  public static void main(String[] args) {
    List<String> items = new ArrayList<>();
    items.add("A");
    items.add("B");
    items.add("C");
    items.add("D");
    items.add("E");

    items.forEach(item -> System.out.println(item));

    List<String> filteredItems = new ArrayList<String>();

    // Output = A
    items.forEach(item -> {
      if (item.equals("A")) {
        filteredItems.add(item);
      }
    });

//    System.out.println(filteredItems);

    System.out.println("Another filter:");
    items.stream().filter(s -> s.equals("A")).forEach(System.out::print);
  }
}
