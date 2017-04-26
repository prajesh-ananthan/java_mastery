package com.java.mastery.lambda_expression.functional_interface;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by ANAN011 on 19/4/2017.
 */
public class ConsumerBiConsumer {
  public static void main(String[] args) {
    // BiConsumer to insert key-value pair into map
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    BiConsumer<Integer, String> biConsumer = (k, v) -> map.put(k, v);

    Consumer<String> consumer = System.out::println;

    biConsumer.accept(1, "Consumer 1");
    biConsumer.accept(2, "Consumer 2");
    biConsumer.accept(3, "Consumer 3");

    printValuesInMap(map, consumer);
  }

  private static void printValuesInMap(HashMap<Integer, String> map, Consumer consumer) {
    for (String value : map.values()) {
      consumer.accept(value);
    }
  }
}
