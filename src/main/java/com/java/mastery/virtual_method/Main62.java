package com.java.mastery.virtual_method;

/**
 * Understanding the use of virtual methods
 * <p>
 * Created by ANAN011 on 6/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Main62 {
  public static void main(String[] args) {
    Animal cow = new Cow();
    feedAnimal(cow);

    Animal lion = new Lion();
    lion.careFor();
  }

  public static void feedAnimal(Animal animal) {
    animal.feed();
  }
}

abstract class Animal {
  public abstract void feed();

  public void careFor() {
    play();
  }

  public void play() {
    System.out.println("Pet Animal");
  }
}

class Cow extends Animal {
  public void feed() {
    addHay();
  }

  private void addHay() {
    System.out.println("Cow: Eat hay!");
  }
}

class Bird extends Animal {
  public void feed() {
    addSeed();
  }

  private void addSeed() {
    System.out.println("Bird: Eat seed!");
  }
}

class Lion extends Animal {
  public void feed() {
    addMeat();
  }

  private void addMeat() {
    System.out.println("Lion: Eat meat!");
  }

  @Override
  public void play() {
    System.out.println("Toss in meat!");
  }
}

