package com.java.mastery.lambda_expression.functional_interface;

import com.java.mastery.lambda_expression.functional_interface.model.Emp;
import com.java.mastery.lambda_expression.functional_interface.model.Validate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 */
public class TestWithoutLambda {
  public static void main(String[] args) {
    List<Emp> employerList = Arrays.asList(
        new Emp("Shreya", 5, 999),
        new Emp("Sheryl", 10, 19999),
        new Emp("Prakash", 8, 1999)
    );

    filter(employerList, new ValidatePerformanceRating());
  }

  static void filter(List<Emp> empList, Validate rule) {
    for (Emp emp : empList) {
      if (rule.check(emp)) {
        System.out.println(emp.getName());
      }
    }
  }
}
