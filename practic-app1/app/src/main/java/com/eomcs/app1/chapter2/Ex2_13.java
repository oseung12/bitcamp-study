package com.eomcs.app1.chapter2;

public class Ex2_13 {
  public static void main (String[] args) {
    int x = 1;
    int y = 2;
    int z = 3;

    int tmp = z;
    z = x;
    x = y;
    y = tmp;

    System.out.println("x = " +x);
    System.out.println("y = " +y);
    System.out.println("z = " +z);

  }

}
