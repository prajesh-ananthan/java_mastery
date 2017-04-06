package com.java.mastery.enum_exercise;

/**
 * Created by ANAN011 on 6/4/2017.
 */
public enum Festival {

  CHINESE_NEW_YEAR("Chinese"), DEEPAVALI("Indian"), HARI_RAYA("Malays");

  private String people;

  private Festival(String people) {
    this.people = people;
  }

  private String getPeople() {
    return people;
  }

  public void printExpectedPeople() {
    System.out.println(people);
  }

  public void printValues() {
    for (Festival festival : Festival.values()) {
      System.out.println(festival);
    }
  }

  public void getFestivalName(String person) {
    for (Festival festival : Festival.values()) {
      if (person.equals(festival.getPeople())) {
        System.out.println(festival.name());
      }
    }
  }
}
