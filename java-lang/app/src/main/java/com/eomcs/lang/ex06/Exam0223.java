package com.eomcs.lang.ex06;

//# 흐름 제어문 - switch와 break
//
public class Exam0223 {
  public static void main(String[] args) {
    int score = 90;
    // break 문을 쓰지 않으면 계속 이어서 실행된다.
    // => 일부러 쓰지 않을 때가 있다.
    // 만일 100~90사이의 점수가 "A" 값을 출력받길 원한다면 if문 사용해야한다.
    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
      case 40:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
    }
  }
}
