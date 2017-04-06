package com.java.mastery.general;

/**
 * Created by ANAN011 on 6/4/2017.
 * <p>
 * Use of instanceof operator
 */
public class Main59 {
  public static void main(String args[]) {
    HeavyAnimal heavyAnimal = new Hippo();
    HeavyAnimal heavyMammal = new Elephant();
    Elephant elephant = new Elephant();
    Hippo hippo = new Hippo();

    boolean b1 = heavyAnimal instanceof HeavyAnimal;
    boolean b2 = heavyMammal instanceof HeavyAnimal;
    boolean b3 = elephant instanceof Elephant;

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
  }
}


class HeavyAnimal {

}

class Hippo extends HeavyAnimal {
}

class Elephant extends HeavyAnimal {
}
