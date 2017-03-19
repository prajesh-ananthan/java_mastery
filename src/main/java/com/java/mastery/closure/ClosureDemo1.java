package com.java.mastery.closure;

@FunctionalInterface
interface Process {
  void process(int i);
}

/**
 * Created by ANAN011 on 19/3/2017.
 */
public class ClosureDemo1 {
  public static void main(String[] args) {
    int a = 10;
    // b is closure
    int b = 20;
    doProcess(a, i -> System.out.println(i + b));
  }

  private static void doProcess(int i, Process p) {
    p.process(i);
  }
}
