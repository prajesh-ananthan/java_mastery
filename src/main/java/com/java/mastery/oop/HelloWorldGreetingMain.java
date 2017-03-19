package com.java.mastery.oop;

/**
 * Created by ANAN011 on 18/3/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class HelloWorldGreetingMain {
  public static void main(String[] args) {
    Greeting greet = new GreetingImpl();

    HelloWorldGreetingMain.sayHello(greet);

    Greeting lambdaGreeting = () -> "Hello world with lambda";

    Greeting innerGreeting = new Greeting() {
      @Override
      public String greet() {
        return "Hello inner greeting!";
      }
    };

    HelloWorldGreetingMain.sayHello(lambdaGreeting);
    HelloWorldGreetingMain.sayHello(innerGreeting);
  }

  private static void sayHello(Greeting greeting) {
    System.out.println(greeting.greet());
  }
}
