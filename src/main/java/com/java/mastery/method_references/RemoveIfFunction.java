package com.java.mastery.method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 11/4/2017.
 *
 *         Use of removeIf
 */
public class RemoveIfFunction {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Magician");
    list.add("Assistant");
    System.out.println(list);

    list.removeIf(s -> s.startsWith("A"));
    System.out.println(list);
  }
}
