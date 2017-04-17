package com.java.mastery.generics;

/**
 * Created by ANAN011 on 13/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class ShippableAbstractCrate<T> implements Shippable<T> {

  public static void main(String[] args) {
    Shippable<Robot> shippable = new ShippableAbstractCrate<>();
    Robot robot = new Robot();
    shippable.ship(robot);
  }

  @Override
  public void ship(T t) {
    if (t instanceof Robot) {
      ((Robot) t).transform();
    }
  }
}
