// 
// - static 변수대신에 왜 인스턴스변수를 사용하는가?
// - static 변수를 왜 사용해야하는가?
// - static 변수의 문제점은 무엇인가?
// - 인스턴스 변수는 어떤점에서 좋은점이 있는가?
// - 인스턴스 변수를 다룰때 static 매서드로 사용 시 단점
//   static는 인스턴스 변수를 사용하지 않는 매서드이다. 단지 외부에서 값을 받아서 작업하는 매서드.
// - static 매소드 대신 인스턴스 매서드 사용 시 이점

// 실습 (Exam0210.java - Exam0280.java)
// 1) 관련 메서드를 클래스로 묶는다.
// 2) 매서드에서 계산한 결과를 클래스 변수에 저장한다.
// 3) 계산한 결과를 인스턴스 변수로 바꿔서 결과를 개별적으로 관리한다. 
//    static 매서드 사용 (즉, 외부에서 result 변수가 들어있는 인스턴스 변수를 받는다 파라미터로 넘어오는 메모리에 담아라!! that)
// 4) 인스턴스 메서드로 바꿔서 인스턴스 주소를 this 변수에 받는다.(모든 인스턴스 매서드에는 내장변수 this 가 존재한다)
// 5) 클래스를 별도의 소스 파일로 분리한다.
// 6) 클래스를 패키지로 분류한다. (public 공개) (import)

package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Calculator;

public class ExamTest2 {


  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(2);
    c2.plus(3);

    c1.plus(3);
    c2.plus(4);

    c1.minus(1);
    c2.minus(2);

    c1.multiple(7);
    c2.multiple(8);

    c1.divide(3);
    c2.divide(4);

    System.out.printf("result = %d\n", c1.getResult());
    System.out.printf("result = %d\n", c2.getResult());
  }

}


