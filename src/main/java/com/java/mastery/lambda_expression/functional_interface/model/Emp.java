package com.java.mastery.lambda_expression.functional_interface.model;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 *         <p>
 *         pg. 447
 *         To highlight the benefits of lambda expression
 */


public class Emp {
  String name;
  int performanceRating;
  double salary;

  public Emp(String name, int performanceRating, double salary) {
    this.name = name;
    this.performanceRating = performanceRating;
    this.salary = salary;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Emp{");
    sb.append("name='").append(name).append('\'');
    sb.append(", performanceRating=").append(performanceRating);
    sb.append(", salary=").append(salary);
    sb.append('}');
    return sb.toString();
  }

  public String getName() {
    return name;
  }

  public int getPerformanceRating() {
    return performanceRating;
  }

  public double getSalary() {
    return salary;
  }
}
