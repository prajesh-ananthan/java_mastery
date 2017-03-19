package com.java.mastery.lambda_expression.exercise;

/**
 * Created by ANAN011 on 18/3/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Person {
  String firstname;
  String lastName;
  int age;

  public Person(String firstname, String lastName, int age) {
    this.firstname = firstname;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
