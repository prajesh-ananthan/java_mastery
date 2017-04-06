import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAN011 on 3/4/2017.
 * Usage of removeIf method which applies for ArrayList in Java 8
 */
public class Lambda451 {
  public static void main(String[] args) {
    List<Emp> empArrList = new ArrayList<>();
    empArrList.add(new Emp("Shreya", 40, 9999));
    empArrList.add(new Emp("Thomas", 20, 5000));
    empArrList.add(new Emp("Suraya", 22, 5000));

    empArrList.removeIf(e -> e.getName().startsWith("S"));

    System.out.println("After deletion:");
    for (Emp emp : empArrList) {
      System.out.println(emp.getName());
    }
  }
}