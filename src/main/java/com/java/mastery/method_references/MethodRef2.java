package com.java.mastery.method_references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by ANAN011 on 19/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class MethodRef2 {
  public static void main(String[] args) {
    StringBuffer sb = getStringBuffer();
    List<String> list = getArrayList();
  }

  private static StringBuffer getStringBuffer() {
    Supplier<StringBuffer> sb = StringBuffer::new;
    return sb.get();
  }

  private static ArrayList getArrayList() {
    Supplier<ArrayList> list = () -> new ArrayList();
    return list.get();
  }
}
