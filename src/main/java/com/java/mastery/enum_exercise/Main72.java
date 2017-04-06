package com.java.mastery.enum_exercise;


/**
 * Created by ANAN011 on 6/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Enums from Java Certification
 */


public class Main72 {
  public static void main(String[] args) {
    Season s = Season.WINTER;
    System.out.println(s == Season.WINTER);

    printOrdinal();
  }

  private static void printOrdinal() {
    for (Season season : Season.values()) {
      System.out.println(season.name() + " : " + season.ordinal());
    }
  }
}
