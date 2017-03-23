package com.java.mastery.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ANAN011 on 23/3/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class StreamDemo3 {
  public static void main(String[] args) {

    List<Hosting> list = new ArrayList<>();
    list.add(new Hosting(1, "liquidweb.com", new Date()));
    list.add(new Hosting(2, "linode.com", new Date()));
    list.add(new Hosting(3, "digitalocean.com", new Date()));

    Map<Integer, String> map = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getUrl()));
    System.out.println(map);

    Map<Integer, String> map2 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getUrl));
    System.out.println(map2);
  }
}

class Hosting {
  private String url;
  private Date date;
  private int id;

  public Hosting(int id, String url, Date date) {
    this.url = url;
    this.date = date;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}