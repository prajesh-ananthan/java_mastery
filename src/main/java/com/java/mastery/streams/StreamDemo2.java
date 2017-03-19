package com.java.mastery.streams;

import com.java.mastery.lambda_expression.exercise.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ANAN011 on 19/3/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *
 * Return a count of a stream
 */
public class StreamDemo2 {

  final static List<Person> people = Arrays.asList(
      new Person("Prajesh", "Ananthan", 29),
      new Person("Pala", "Ganesh", 30),
      new Person("Vikneshan", "Sundralingam", 29),
      new Person("Ananthan", "Valayudam", 55)
  );

  public static void main(String[] args) {
    long count = people.stream()
        .filter(p -> p.getFirstname().startsWith("P"))
        .count();

    System.out.println(count);
  }
}
