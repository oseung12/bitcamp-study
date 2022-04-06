package com.eomcs.mylist.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Test {
  int no;
  String title;
  boolean done;



}
