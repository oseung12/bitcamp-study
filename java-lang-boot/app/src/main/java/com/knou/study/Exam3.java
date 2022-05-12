package com.knou.study;

class A {
  public void output() {
    System.out.println("컴퓨터과학과");
  }
}
class B extends A {
  @Override
  public void output() {
    System.out.println("202234-363474");
  }
}
class C extends B {
  @Override
  public void output() {
    System.out.println("오승지");
  }
}

public class Exam3{
  public static void main(String args[]) {
    A a = new A();
    a.output();
    a = new B();
    a.output();
    B b = new C();
    b.output();
  }
}
