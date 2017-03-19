package com.java.mastery.streams;

import com.java.mastery.streams.model.Winner;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ANAN011 on 19/3/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class StreamCookBook1 {
  public static final List<Winner> tdfWinners = Arrays.asList(
      new Winner(2006, "Spain", "Óscar Pereiro", "Caisse d'Epargne–Illes Balears", 3657, Duration.parse("PT89H40M27S"), 8),
      new Winner(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570, Duration.parse("PT91H00M26S"), 4),
      new Winner(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
      new Winner(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
      new Winner(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"), 12),
      new Winner(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"), 2),
      new Winner(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
      new Winner(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
      new Winner(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
      new Winner(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"), 16),
      new Winner(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14));

  public static void main(String[] args) {
    //TODO: https://dzone.com/articles/a-java-8-streams-cookbook?edition=268944&utm_source=Daily%20Digest&utm_medium=email&utm_campaign=dd%202017-02-14
  }
}
