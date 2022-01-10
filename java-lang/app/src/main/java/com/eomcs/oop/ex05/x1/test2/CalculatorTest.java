package com.eomcs.oop.ex05.x1.test2;

public class CalculatorTest {

  public static void main(String[] args) {
    Calculator c = new Calculator();

    c.plus(100);
    c.minus(200);
    c.multiple(2);

    System.out.println(c.result);
  }
}
