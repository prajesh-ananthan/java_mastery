package com.java.mastery.generics;

/**
 * Created by ANAN011 on 13/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class ShippableRobotCrate implements Shippable<Robot> {

  @Override
  public void ship(Robot robot) {
    robot.transform();
  }
}
