package com.java.mastery.lambda_expression.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ANAN011 on 18/3/2017.
 */
public class PersonMain {

  final static List<Person> people = Arrays.asList(
      new Person("Prajesh", "Ananthan", 29),
      new Person("Pala", "Ganesh", 30),
      new Person("Vikneshan", "Sundralingam", 29),
      new Person("Ananthan", "Valayuddam", 55)
  );

  public static void main(String[] args) {
    Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
      }
    });

    printList();
  }

  // create a method that prints out all elements in the list

  private static void printList() {
    for (Person person : people) {
      System.out.println(person.getFirstname());
    }
  }
}
