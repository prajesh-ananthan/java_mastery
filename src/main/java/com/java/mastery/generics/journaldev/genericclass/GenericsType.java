package com.java.mastery.generics.journaldev.genericclass;

/**
 * @author Prajesh Ananthan
 *         Created on 31/7/2017.
 */
public class GenericsType<T> {

  private T t;

  public static void main(String[] args) {
    GenericsType<String> generic = new GenericsType<>();
    generic.set("abc");
    System.out.println(generic.get());

  }

  public T get() {
    return this.t;
  }

  public void set(T t1) {
    this.t = t1;
  }
}
