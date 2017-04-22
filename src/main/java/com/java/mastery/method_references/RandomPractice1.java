package com.java.mastery.method_references;

/**
 * Created by ANAN011 on 18/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */

interface Sayable {
  void say();
}

class MethodReference {
  static void saySomething() {
    System.out.println("Say something!");
  }
}

public class RandomPractice1 {
  public static void main(String[] args) {
    Sayable s = MethodReference::saySomething;
    s.say();
  }
}
