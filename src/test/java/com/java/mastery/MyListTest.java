package com.java.mastery;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Created by ANAN011 on 27/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class MyListTest {

  private ArrayList<String> lstTest = new ArrayList<String>();

  @Before
  public void init() {
    lstTest.add("Apple");
    lstTest.add("Orange");
    lstTest.add("Grapes");
  }

  @Test
  public void add() throws Exception {
    assertEquals(3, lstTest.size());
  }

  /*
  * Could use this approach to test void methods
  * */
  @Test
  public void remove() throws Exception {
    lstTest.remove("Orange");
    assertEquals(2, lstTest.size());
  }

  @Test(expected = NoSuchElementException.class)
  public void testRemoveException() {
    lstTest.remove("Kiwi");
  }

  @Test
  public void removeAll() throws Exception {

  }

}