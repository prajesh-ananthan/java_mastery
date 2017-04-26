package com.java.mastery.lambda_expression.functional_interface;

import java.util.function.BiFunction;

/**
 * Created by ANAN011 on 25/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class BiFunctionTest {
  public static void main(String[] args) {
    final String name = concatStringWithBiFunction("Prajesh");
    System.out.println(name);
  }

  private static String concatStringWithBiFunction(String name) {
    BiFunction<String, String, String> b1 = (string, toAdd) -> string.concat(toAdd);
    return b1.apply(name, " Ananthan");
  }
}
