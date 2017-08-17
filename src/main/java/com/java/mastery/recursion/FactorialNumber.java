package com.java.mastery.recursion;

/**
 * @author Prajesh Ananthan
 *         Created on 17/8/2017.
 */
public class FactorialNumber {
  private static int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      int value = n * factorial(n - 1);
      return (value);
    }

  }

  public static void main(String[] args) {
    System.out.println("Factorial of 5 is " + factorial(5));
  }
}
