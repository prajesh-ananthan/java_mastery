package com.java.mastery.lambda_expression.functional_interface.model;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 */
@FunctionalInterface
public interface Validate {
  boolean check(Emp emp);
}