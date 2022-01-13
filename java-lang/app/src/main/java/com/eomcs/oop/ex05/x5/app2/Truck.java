package com.eomcs.oop.ex05.x5.app2;

import com.eomcs.oop.ex05.x4.app1.Car;

public class Truck {

  Car car = new Car();

  public void start() {
    car.start();
  }

  public void stop() {
    car.stop();
  }

  public void run() {
    car.run();
  }

  // 트럭 기능 추가
  public void dump() {
    System.out.println("짐 내린다!");
  }
}
