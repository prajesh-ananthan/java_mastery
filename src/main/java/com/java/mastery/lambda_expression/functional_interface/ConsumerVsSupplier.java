package com.java.mastery.lambda_expression.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by ANAN011 on 18/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         A supplier does not take in any input
 */
public class ConsumerVsSupplier {
  public static void main(String[] args) {
    Supplier s = () -> Names.getNames();
    displayStringWithConsumer("Hello Consumer!");
  }

  static void printNames(Supplier supplier) {
    System.out.println(supplier.get());
  }

  private static void displayStringWithConsumer(String value) {
    Consumer<String> supplier = System.out::println;
    supplier.accept(value);
  }

  private ArrayList<String> getArrayListConstructor() {
    Supplier<ArrayList<String>> supplier = ArrayList<String>::new;
    return supplier.get();
  }
}

class Names {
  public static String getNames() {
    List<String> names = new ArrayList<String>();
    names.add("Person1");
    names.add("Person2");
    names.add("Person3");
    String s = new String();
    for (String name : names) {
      s += name;
    }
    return s;
  }
}


class SupplierTest {

}
