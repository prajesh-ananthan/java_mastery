package com.java.mastery.lambda_expression.functional_interface;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * Created by ANAN011 on 24/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         A supplier is when you wnat to generate or supply values without taking any input
 */
public class SupplierExercise1 {
  public static void main(String[] args) {
    Supplier<LocalDate> today = () -> LocalDate.now();
    System.out.println(today.get());
  }
}
