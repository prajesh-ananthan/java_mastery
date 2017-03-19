package com.java.mastery.lambda_expression;

interface StringLengthLambda {
  int getLength(String s);
}

public class Java8Tester4 {
  public static void main(String[] args) {
    // one input argument and one return value
    StringLengthLambda stringLengthLambda = s -> s.length();
    int length = stringLengthLambda.getLength("prajesh");
    System.out.println(length);
  }
}