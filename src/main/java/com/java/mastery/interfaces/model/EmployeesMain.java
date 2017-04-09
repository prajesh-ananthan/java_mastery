package com.java.mastery.interfaces.model;

import java.time.LocalDateTime;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 *         <p>
 *         Experimenting the use of default and static methods within an interface
 */

class Employee {
  String name;
  String address;
  String phoneNumber;
  int experience;
}

class Manager extends Employee implements Interviewer, Trainable {

  @Override
  public void attendTraining() {
    System.out.println("Manager - attend training");
  }

  @Override
  public void conductInterview() {
    System.out.println("Manager - conduct interview");
  }
}

class Programmer extends Employee implements Trainable {

  @Override
  public void attendTraining() {
    System.out.println("Programmer - attend training");
  }
}

public class EmployeesMain {
  public static void main(String[] args) {
    Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);

//    NOTE: Won't compile
//    Interviewer interviewer2 = new Manager();
//    interviewer2.bookConferenceRoom(LocalDateTime.now(), 3);

  }
}
