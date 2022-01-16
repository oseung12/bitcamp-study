package com.eomcs.oop.ex05.x7;

public class Sedan {
  int cc;
  int calce;
  boolean auto;
  boolean openedSunroof;

  public void start() {
    System.out.println("시동을 건다");
  }

  public void stop() {
    System.out.println("시동을 끈다");
  }

  public void run() {
    System.out.println("세단 씽씽 달린다");
  }

  public void openSunroof() {
    System.out.println("썬루프 연다");
    this.openedSunroof = true;
  }

  public void closeSunroof() {
    System.out.println("썬루프 닫는다");
    this.openedSunroof = false;
  }
}
