package google_guava;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by ANAN011 on 18/6/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Initialiing collections in one line
 */
public class InitializeCollectionEx {

  public static void main(String[] args) {
    // Map
    Map items = ImmutableMap.of("coin", 3, "glass", 4, "pencil", 1);
    System.out.println("Map:");
    items.entrySet().stream().forEach(System.out::println);


    // List
    List <String> fruitList = Lists.newArrayList("orange", "banana", "kiwi",
        "mandarin", "date", "quince");

    List<String> fruits = Lists.newArrayList(fruitList);
    System.out.println("List:");
    fruits.stream().forEach(s -> System.out.println(s));
  }
}
