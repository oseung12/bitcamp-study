package com.eomcs.oop.ex05.x5.app1;

// 자동차를 만들기
//
// 4) 기존 클래스를 포함한 후 기능 덧붙이기
//
public class CarTest1 {

  public static void main(String[] args) {
    // Engine 클래스를 포함한 Car 클래스를 만든다.
    // => start(), stop() 메서드 추가
    Car car = new Car();
    car.start();
    car.run(); // 실제 실행은 Engine 객체에게 위임한다.
    car.stop();
  }
}
