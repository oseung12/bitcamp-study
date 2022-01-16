package com.eomcs.oop.ex05.x7;

import com.eomcs.design_pattern.decorator.ex02.before.Sedan;

public class CarTest1 {

  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    testSedan(sedan);

    System.out.println("-------------");

    Truck truck = new Truck();
    testTruck(truck);
  }

  static void testSedan(Sedan sedan) {
    sedan.start();
    sedan.run();
    sedan.stop();
  }

  static void testTruck(Truck truck) {
    truck.launch();
    truck.go();
    truck.stopping();
    truck.dump();
  }
}
