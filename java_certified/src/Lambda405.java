import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ANAN011 on 31/3/2017.
 */
public class Lambda405 {
  public static void main(String args[]) {
    List<Emp> list = Arrays.asList(
        new Emp("Shreya", 40, 9999),
        new Emp("Thomas", 20, 5000),
        new Emp("Shreya", 34, 3000)
    );

    Predicate<Emp> predicate = e -> e.getPerformanceRating() > 3000;
    filter(list, predicate);
  }

  static void filter(List<Emp> list, Predicate<Emp> rule) {
    for (Emp emp : list) {
      if (rule.test(emp)) {
        System.out.println(emp.getPerformanceRating());
      }
    }
  }
}

class Emp {
  private String name;
  private int age;
  private int performanceRating;

  public Emp(String name, int age, int performanceRating) {

    this.name = name;
    this.age = age;
    this.performanceRating = performanceRating;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getPerformanceRating() {
    return performanceRating;
  }
}
