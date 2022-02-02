package com.eomcs.app1.chapter2;

public class Ex2_9 {

  public static void main(String[] args) {
    String url = "www.codeooo.com";
    float f1 = .10f;    // 0.10, 1.0e-1 
    float f2 = 1e1f;    // 10.0, 1.0e1, 1.0e+1
    float f3 = 3.14e3f;
    double d = 1.23456789;

    System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
    System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
    System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
    System.out.printf("d=%f%n", d);      // 마지막 자리 반올림된다.
    System.out.printf("d=%14.10f%n", d); // %전체자리.소수점아래자리f => 전체 14자리 중 소수점 10자리 
    System.out.printf("[12345678901234567890]%n");
    System.out.printf("[%s]%n", url);       // 문자열의 길이만큼 출력공간을 확보
    System.out.printf("[%20s]%n", url);     // 최소 20글자 출력공간 확보 (오른쪽 정렬)
    System.out.printf("[%-20s]%n", url);    // 최소 20글자 출력공간 확보 (왼쪽 정렬)
    System.out.printf("[%.8s]%n", url);     // 문자열의 일부만 출력 => 왼쪽에서 8글자만 출력


  }

}

// %d : 10진 정수의 형식으로 출력
// %x : 16진 정수의 형식으로 출력
// %f : 부동소수점의 형식으로 출력 (기본 소수적 아래 6자리까지만 출력)
// %c : 문자로 출력
// %s : 문자열로 출력
// %e : 지수 형태로 출력
// %g : 값을 간략하게 표현할 때 사용
