package com.java.mastery.interfaces.model;

import java.time.LocalDateTime;

/**
 * @author Prajesh
 *         Created by Prajesh Ananthan on 8/4/2017.
 */
public interface Interviewer {
  static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
    System.out.println("Interview scheduled at " + dateTime);
    System.out.println("Book conference room for " + duration + " hours.");
  }

  public void conductInterview();

  default void submitInterviewStatus() {
    System.out.println("Manager: Accept");
  }
}
