package com.java.mastery.streams.model;

import java.util.Date;

/**
 * Created by ANAN011 on 6/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Hosting {
  private int Id;
  private String name;
  private Date createdDate;

  public Hosting(int id, String name, Date createdDate) {
    Id = id;
    this.name = name;
    this.createdDate = createdDate;
  }

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  //getters and setters
}