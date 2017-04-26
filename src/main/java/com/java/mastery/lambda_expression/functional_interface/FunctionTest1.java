package com.java.mastery.lambda_expression.functional_interface;

import java.util.function.Function;

/**
 * Created by ANAN011 on 24/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class FunctionTest1 {
  public static void main(String[] args) {
    System.out.println(getStringLengthWithFunction("claris"));
  }

  private static int getStringLengthWithFunction(String name) {
    Function<String, Integer> function = x -> x.length();
    return function.apply(name);
  }
}
