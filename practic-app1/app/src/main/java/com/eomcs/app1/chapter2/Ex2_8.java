// 두 변수의 값 바꾸기
package com.eomcs.app1.chapter2;

public class Ex2_8 {

  public static void main(String[] args) {
    //int x = 10;
    //int y = 5;
    int x = 10, y = 5;
    System.out.println("x=" + x);
    System.out.println("y=" + y);

    //int tmp;
    //tmp = x;
    int tmp = x;
    x = y;
    y = tmp;
    System.out.println("x=" + x);
    System.out.println("y=" + y);
  }

}
