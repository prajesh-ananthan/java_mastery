package com.java.mastery.lambda_expression.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by ANAN011 on 24/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class PredicateBiPredicate {
  public static void main(String[] args) {
    String name = "";
    String name2 = "Anastasia";
    String prefix = "Anas";
    boolean predicateResult = passPredicate(name);
    boolean biPredicateResult = passBiPredicate(name2, prefix);

    System.out.println(predicateResult);
    System.out.println(biPredicateResult);
  }


  private static boolean passPredicate(String s) {
    Predicate<String> predicate = x -> x.isEmpty();
    return predicate.test(s);
  }

  private static boolean passBiPredicate(String string, String prefix) {
    BiPredicate<String, String> biPredicate = (stringValue, stringPrefix) -> string.startsWith(prefix);
    return biPredicate.test(string, prefix);
  }
}
