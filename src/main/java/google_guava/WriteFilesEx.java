package google_guava;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * Created by ANAN011 on 18/6/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Writes file in the project root directory
 */
public class WriteFilesEx {
  public static void main(String[] args) throws IOException {
    String fileName = "fruits.txt";
    File file = new File(fileName);

    String content = "banana, orange, lemon, apple, plum";
    Files.write(content.getBytes(), file);
  }
}
