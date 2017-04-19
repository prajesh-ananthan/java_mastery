package com.java.mastery.lambda_expression.functional_interface;

import com.java.mastery.lambda_expression.exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by ANAN011 on 19/4/2017.
 */
public class PredicateTest {
  final static List<Person> people = Arrays.asList(
      new Person("Prajesh", "Ananthan", 29),
      new Person("Pala", "Ganesh", 30),
      new Person("Vikneshan", "Sundralingam", 29),
      new Person("Ananthan", "Valayuddam", 55)
  );

  public static void main(String[] args) {
    Consumer<Person> consumer = p -> System.out.println(p.getLastName());
    printValues(people, p -> p.getFirstname().startsWith("P"), consumer);
  }

  private static void printValues(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
    for (Person p : list) {
      if (predicate.test(p)) {
        consumer.accept(p);
      }
    }
  }
}
