package com.eomcs.oop.ex02;


public class ExamTest1 {


  static class Score {
    // 변수 선언 : 데이터 타입을 설계
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    // 매서드 정의 : 데이터를 다루는 연산자를 정의
    void Calculate() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3f;
    }
  }

  public static void main(String[] args) {

    Score s = new Score();

    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 85;

    s.Calculate();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math,s.sum, s.average);
  }
}

