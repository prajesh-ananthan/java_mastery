package model;

/**
 * Created by ANAN011 on 3/4/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
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