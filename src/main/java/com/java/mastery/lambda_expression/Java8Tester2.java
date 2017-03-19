package com.java.mastery.lambda_expression;

/**
 * Created by ANAN011 on 17/3/2017.
 */
public class Java8Tester2 {

  final static String salutation = "Hello ";

  public static void main(String[] args) {
    GreetingService service = message -> System.out.println(salutation + message);
    service.sayMessage("Prajesh");
  }

  interface GreetingService {
    void sayMessage(String message);
  }
}