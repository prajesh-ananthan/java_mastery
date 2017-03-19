package com.java.mastery.lambda_expression.functional_interface;

import com.java.mastery.lambda_expression.exercise.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ANAN011 on 18/3/2017.
 * <p>
 * Leveraging the usage functional interface with the predicate interface
 */
public class FuntionalInterface {

  final static List<Person> people = Arrays.asList(
      new Person("Prajesh", "Ananthan", 29),
      new Person("Pala", "Ganesh", 30),
      new Person("Vikneshan", "Sundralingam", 29),
      new Person("Ananthan", "Valayuddam", 55)
  );

  public static void main(String[] args) {
    System.out.println("Printing first names beginning with P: ");
    printConditionally(people, p -> p.getFirstname().startsWith("P"));

    System.out.println("Printing last names beginning with A: ");
    printConditionally(people, p -> p.getLastName().startsWith("A"));
  }

  private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
    for (Person p : people) {
      if (predicate.test(p)) {
        System.out.println(p.getLastName());
      }
    }
  }
}
