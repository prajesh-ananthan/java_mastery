package com.java.mastery.enum_exercise;


/**
 * Created by ANAN011 on 6/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *
 * Enums within switch statement
 */


public class Main74 {
  public static void main(String[] args) {
    Season season = Season.SUMMER;
    String message = getSeasonMessage(season);
    System.out.println(message);
  }

  private static String getSeasonMessage(Season season) {
    String message = "";
    switch (season) {
      case WINTER:
        message = "Get out the sled!";
        break;
      case SUMMER:
        message = "Time for pool!";
        break;
      default:
        message = "Is it summer yet?";
    }
    return message;
  }
}

