package com.java.mastery.generics.bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAN011 on 14/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class UnBoundedWildcards {
  public static void main(String[] args) {
    List<String> keywords = new ArrayList<String>();
    keywords.add("Java");
    printList(keywords);

  }

  private static void printList(List<?> keywords) {
    for (Object x : keywords) {
      System.out.println((int) x);
    }
  }
}
