package com.java.mastery.method_references;

import com.java.mastery.method_references.model.Duck;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by ANAN011 on 10/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class DuckHelper {

  public static int compareByWeight(Duck d1, Duck d2) {
    return d1.getWeight() - d2.getWeight();
  }

  public static void main(String[] args) {
    ArrayList<Duck> duckList = Duck.getDucks();

    // With lambda expression
    System.out.println("With Lambda Expression:");
    Predicate<Duck> predicate = p -> DuckHelper.filterWeight(p);
    Consumer<Duck> consumer = p -> DuckHelper.printWeight(p);
    printConditionally(duckList, predicate, consumer);

    // With method reference
    System.out.println("\nWith Method Reference:");
    Predicate<Duck> predicateMethodRef = DuckHelper::filterWeight;
    Consumer<Duck> consumerMethodRef = DuckHelper::printWeight;
    printConditionally(duckList, predicateMethodRef, consumerMethodRef);
  }

  private static void printConditionally(ArrayList<Duck> ducks, Predicate<Duck> predicate, Consumer<Duck> consumer) {
    for (Duck duck : ducks) {
      if (predicate.test(duck)) {
        consumer.accept(duck);
      }
    }
  }

  private static boolean filterWeight(Duck duck) {
    return duck.getWeight() > 40;
  }

  private static void printWeight(Duck duck) {
    System.out.println(duck);
  }
}
