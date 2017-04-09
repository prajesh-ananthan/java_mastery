package com.java.mastery.lambda_expression.functional_interface;

import com.java.mastery.lambda_expression.functional_interface.model.Emp;
import com.java.mastery.lambda_expression.functional_interface.model.Validate;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 */
public class ValidatePerformanceRating implements Validate {
  @Override
  public boolean check(Emp emp) {
    return emp.getSalary() > 1000;
  }
}
