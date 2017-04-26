package com.java.mastery;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by ANAN011 on 27/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class MyList {

  private List lstFruits = new ArrayList<>();

  public void add(String fruit) {
    lstFruits.add(fruit);
  }

  public void remove(String fruit) {
    if (!lstFruits.contains(fruit)) {
      throw new NoSuchElementException();
    }
    lstFruits.remove(fruit);
  }

  public int size() {
    return lstFruits.size();
  }

  public void removeAll() {
    lstFruits.clear();
  }
}
