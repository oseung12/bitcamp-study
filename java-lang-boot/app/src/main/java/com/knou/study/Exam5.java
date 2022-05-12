package com.knou.study;

public class Exam5 {
  class FinalMember{
    int a = 10;
    public void setA(int a) {
      this.a=a;
    }
  }

  public class  MidTest {
    public void main(String[] args) {
      FinalMember ft = new FinalMember();
      ft.setA(10);
      System.out.println(ft.a);
    }
  }
}