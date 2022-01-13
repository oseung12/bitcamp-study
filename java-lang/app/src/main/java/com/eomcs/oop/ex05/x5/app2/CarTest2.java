package com.eomcs.oop.ex05.x5.app2;

// 트럭 만들기
//
// 4) 기존 클래스를 포함한 후 기능 덧붙인다.
//
public class CarTest2 {

  public static void main(String[] args) {
    // Engine 클래스를 포함한 Truck 클래스를 만든 후 트럭을 위한 덤프 기능을 추가한다.
    // => dump() 메서드 추가

    Truck car = new Truck();
    car.start();
    car.run();
    car.dump();
    car.stop();

  }

}
