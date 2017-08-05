package com.java.mastery.generics.journaldev.genericmethod;

import com.java.mastery.generics.journaldev.genericclass.GenericsType;

/**
 * @author Prajesh Ananthan
 *         Created on 4/8/2017.
 */
public class GenericsMethods {
  public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
    return g1.get().equals(g1.get());
  }

  public static void main(String[] args) {
    GenericsType<String> g1 = new GenericsType<>();
    g1.set("prajesh");

    GenericsType<String> g2 = new GenericsType<>();
    g2.set("prajesh");

    boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);

    //above statement can be written simply as
    isEqual = GenericsMethods.isEqual(g1, g2);
    // This feature, known as type inference, allows you to invoke a generic method as an ordinary method,
    // without specifying a type between angle brackets.
    // Compiler will infer the type that is needed
  }
}
