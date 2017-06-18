package google_guava;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ANAN011 on 18/6/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         Predicates are used to filter data
 *         <p>
 *         Iterates over a collection and filter elements with defined Predicates inside filter
 */
public class Collections2Ex {
  public static void main(String[] args) {
    List<String> items = Lists.newArrayList("coin", "book",
        "cup", "purse", "bottle");

    List<String> filtered = items.stream().filter(p -> p.contains("o")).collect(Collectors.toList());
    for (String item : filtered) {
      System.out.println(item);
    }

    System.out.println("\n");

    Collection<String> result = Collections2.filter(items,
        Predicates.containsPattern("o"));

    for (String item : result) {
      System.out.println(item);
    }
  }
}
