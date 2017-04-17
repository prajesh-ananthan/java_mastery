package com.java.mastery.generics.bounds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAN011 on 17/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Upeprbounded classes are inmuttable
 */
public class Main120 {
  public static void main(String[] args) {
    List<? extends Bird> birds = new ArrayList<Bird>();
//    birds.add(new Bird());
//    birds.add(new Sparrow());
  }

  static class Bird {
  }

  static class Sparrow extends Bird {
  }
}

