package com.eomcs.oop.ex05.x5.app1;

import com.eomcs.oop.ex05.x4.Engine;

public class Car {

  Engine engine = new Engine();

  // 위임한다.
  public void run() {
    engine.run();
  }

  // 자동차 기능 추가
  public void start() {
    System.out.println("시동 건다!");
  }

  public void stop() {
    System.out.println("시동 끈다!");
  }
}
