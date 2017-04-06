package com.java.mastery.general;

/**
 * Created by ANAN011 on 6/4/2017.
 * <p>
 * Using instanceof operator with conditioning
 */
public class Main61 {
  private static Animal animal;

  public static void main(String[] args) {
    animal = new Cow();
    feedAnimal(animal);
  }

  private static void feedAnimal(Animal animal) {
    if (animal instanceof Cow) {
      ((Cow) animal).addHay();
    } else if (animal instanceof Bird) {
      ((Bird) animal).addSeed();
    } else if (animal instanceof Lion) {
      ((Lion) animal).addMeet();
    } else {
      throw new RuntimeException("Unsupported animal!");
    }
  }
}

class Animal {
}

class Cow extends Animal {
  public void addHay() {
    System.out.println("Add hay");
  }
}

class Bird extends Animal {
  public void addSeed() {
    System.out.println("Add seed");
  }
}

class Lion extends Animal {
  public void addMeet() {
    System.out.println("Add meet");
  }
}
