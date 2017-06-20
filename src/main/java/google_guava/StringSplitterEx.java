package google_guava;

import com.google.common.base.Splitter;

import java.util.List;

/**
 * Created by ANAN011 on 19/6/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Convert a String into a list
 */
public class StringSplitterEx {
  public static void main(String[] args) {
    String input = "There is a dog in the garden.";
    List<String> words = Splitter.on(" ").splitToList(input);

    for (String word : words) {
      System.out.println(word);
    }
  }
}
