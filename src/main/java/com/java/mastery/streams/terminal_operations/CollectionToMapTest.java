package com.java.mastery.streams.terminal_operations;


import com.java.mastery.streams.model.Hosting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by ANAN011 on 6/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 *         <p>
 *         A Java 8 example to convert a List<?> of objects into a Map<k, v>
 *         <p>
 *         Taken from mkyong.com
 */
public class CollectionToMapTest {
  public static void main(String[] args) {
    List<Hosting> hostingsList = new CollectionToMapTest().getList();

    Map<Integer, String> resultsMap = hostingsList.stream()
                                      .collect(
                                          Collectors.toMap(
                                              x -> x.getId(), x -> x.getName()
                                          )
                                      );

    System.out.println(resultsMap);

  }

  private List<Hosting> getList() {
    List<Hosting> list = new ArrayList<>();
    list.add(new Hosting(1, "liquidweb.com", new Date()));
    list.add(new Hosting(2, "linode.com", new Date()));
    list.add(new Hosting(3, "digitalocean.com", new Date()));
    return list;
  }
}
