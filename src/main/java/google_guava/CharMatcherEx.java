package google_guava;

import com.google.common.base.CharMatcher;

/**
 * Created by ANAN011 on 20/6/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Guava CharMatcher
 *         <p>
 *         Removes integers from the String
 */
public class CharMatcherEx {
  public static void main(String[] args) {
    String input = "Peter17";
    CharMatcher matcher = CharMatcher.javaLetter();
    String result = matcher.retainFrom(input);
    System.out.println(result);
  }
}
