package apache_commons_lang;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by ANAN011 on 18/6/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class ApacheCommonsLangEx1 {
  public static void main(String[] args) {
    // String with Space
    String space = StringUtils.SPACE;
    String name = "Prajesh" + space+ "Ananthan";
    System.out.println(space.length());
    System.out.println(name);

    // Empty String
    String emptyString = StringUtils.EMPTY;
    System.out.println(emptyString.length());
  }
}