package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class My1Controller {

  String[] containers = new String[5];
  int size = 0;

  @RequestMapping("/my1/list")
  public Object list() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = containers[i];
    }
    return arr;
  }

  @RequestMapping("/my1/add")
  public Object add(String name, String type, String price, String pcs) {
    String container = name + "," + type + "," + price + "," + pcs;
    containers[size++] = container;
    return size;
  }

  @RequestMapping("/my1/get")
  public Object get(String name) {
    for (int i = 0; i < size; i++) {
      if (containers[i].split(",")[0].equals(name)) {
        return containers[i];
      }
    }
    return "";
  }

  @RequestMapping("/my1/update")
  public Object update(String name, String type, String price, String pcs) {
    String container = name + "," + type + "," + price + "," + pcs;
    for (int i = 0; i < size; i++) {
      if (containers[i].split(",")[0].equals(name)) {
        containers[i] = container;
        return 1;
      }
    }
    return 0;
  }

  @RequestMapping("/my1/delete")
  public Object delete(String name) {
    for (int i = 0; i < size; i++) {
      if (containers[i].split(",")[0].equals(name)) {

        for (int j = i +1; j < size; j++) {
          containers[j -1] = containers[j];
        }
        size--;
        return 1;
      }
    }
    return 0;
  }

}
