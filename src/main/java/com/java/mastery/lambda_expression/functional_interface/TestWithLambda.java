package com.java.mastery.lambda_expression.functional_interface;

import com.java.mastery.lambda_expression.functional_interface.model.Emp;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 *         <p>
 *         pg. 448 from OCA Book: Code written to showcase the benefit of using lambda expression
 *         Predicate interface utilized.
 *         <p>
 *         removeIf method for ArrayList
 */
public class TestWithLambda {
  public static void main(String[] args) {
    ArrayList<Emp> empList = new ArrayList<Emp>();
    empList.add(new Emp("Shreya", 5, 999));
    empList.add(new Emp("Sheryl", 10, 19999));
    empList.add(new Emp("Prakash", 8, 1999));

    Predicate<Emp> predicatePerformance = e -> e.getPerformanceRating() > 5;
    Predicate<Emp> predicateSalary = e -> e.getSalary() > 10000;

    System.out.println("Filter by performance..");
    TestWithLambda.filterWithPredicate(empList, predicatePerformance);

    System.out.println("Filter by salary..");
    TestWithLambda.filterWithPredicate(empList, predicateSalary);

    System.out.println("Using removeIf method in ArrayList");
    // removeIf method insdie the ArrayList method
    empList.removeIf(e -> e.getName().startsWith("P"));
    for (Emp e : empList) {
      System.out.println(e);
    }
  }

  static void filterWithPredicate(ArrayList<Emp> empList, Predicate<Emp> rule) {
    for (Emp emp : empList) {
      if (rule.test(emp)) {
        System.out.println(emp.getName());
      }
    }
  }
}
