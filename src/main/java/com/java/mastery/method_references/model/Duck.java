package com.java.mastery.method_references.model;

import java.util.ArrayList;

/**
 * Created by ANAN011 on 10/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Duck {
  private String name;
  private int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Duck{" +
        "name='" + name + '\'' +
        ", weight=" + weight +
        '}';
  }
  public static ArrayList<Duck> getDucks() {
    ArrayList<Duck> duckList = new ArrayList<>();
    duckList.add(new Duck("duck1", 40));
    duckList.add(new Duck("duck2", 50));
    duckList.add(new Duck("duck3", 60));
    return duckList;
  }
}
