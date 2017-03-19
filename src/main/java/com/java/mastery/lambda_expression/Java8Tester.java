package com.java.mastery.lambda_expression;

/**
 * Created by ANAN011 on 17/3/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Java8Tester {
  public static void main(String[] args) {
    Java8Tester tester = new Java8Tester();

    MathOperation addition = (int a, int b) -> a + b;
    int value = tester.operate(2, 3, addition);
    System.out.println(value);

    MathOperation substraction = (int a, int b) -> a - b;
    int subValue = tester.operate(3, 2, substraction);
    System.out.println(subValue);
  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }

  interface MathOperation {
    int operation(int a, int b);
  }
}
