package com.java.mastery.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ANAN011 on 10/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Lambda expression vs Method reference
 */
public class MethodRef1 {
  static final List<String> stringList = Arrays.asList("dbc", "accfsfkkj", "adkdjhsde", "abcdbc");

  public static void main(String[] args) {
    final String emptyStr = "";
    final String notEmptyStr = "abc";

    Predicate<String> predicateLambda = s -> s.isEmpty();
    Predicate<String> predicateMethodRef = String::isEmpty;

    String result = stringIsEmpty(emptyStr, predicateMethodRef) ? "String is empty!" : "String is NOT empty!";
    System.out.println(result);
  }

  private static boolean stringIsEmpty(String str, Predicate<String> predicate) {
    return predicate.test(str) ? true : false;
  }
}
