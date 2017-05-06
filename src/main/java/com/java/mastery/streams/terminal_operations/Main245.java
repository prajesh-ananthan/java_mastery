package com.java.mastery.streams.terminal_operations;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by ANAN011 on 6/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Reduction test using the old and new approach
 */
public class Main245 {
  public static void main(String[] args) {
    String[] stringArray = new String[]{
        "w", "o", "l", "f"
    };

    //Old approach
    String result = "";
    for (String s : stringArray) {
      result += s;
    }
    System.out.println(result);

    //new approach
    String word = Arrays.stream(stringArray).reduce("", ((s, c) -> s + c));
    System.out.println(word);

    new Main245().usingStreams();
  }

  private void usingStreams() {
    Stream<String> stream = Stream.of("W", "O", "L", "F");
    String word = stream.reduce("", ((s, c) -> s + c));
    System.out.println(word);


  }

}
