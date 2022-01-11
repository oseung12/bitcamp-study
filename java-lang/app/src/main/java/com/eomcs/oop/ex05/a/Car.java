package com.eomcs.oop.ex05.a;

public class Car {

  public String model;
  public String maker;
  public int capacity;

  public Car() {}  // 인스턴스 만들때 초기화

  public Car(String model, String maker, int capacity) {  // 인스턴스를 만들면서 값을 주면서 초기화
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }

  public void run() {   //대체로 인스턴스 멤버를 쓰지 않는 메서드는 static를 사용한다. 지금은 사용하지 않음
    System.out.println("달린다!");
  }
}


