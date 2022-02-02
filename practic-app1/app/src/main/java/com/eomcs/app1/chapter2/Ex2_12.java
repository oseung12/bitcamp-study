// 타입 간의 변환 방법
package com.eomcs.app1.chapter2;

public class Ex2_12 {
  public static void main (String[] args) {
    String str = "3";

    // 1. 숫자를 문자로 변환 - 숫자에 '0'을 더한다.
    System.out.println((char)(3 + '0')); // => '3'

    // 2. 문자를 숫자로 변환 - 문자에서 '0'을 뺀다
    System.out.println('3' - '0');  // => 3
    System.out.println('3' - '0' +1); // => 4

    // 3. 숫자를 문자열로 변환 - 숫자에 빈 문자열("")을 더한다
    System.out.println(5 + ""); // => "5"

    // 4. 문자열을 숫자로 변환 - Integer.parselIn() 또는 Double.parseDouble() 사용
    System.out.println(Integer.parseInt("3")); // => 3 
    System.out.println(Double.parseDouble("3.14")); // => 3.14
    System.out.println(Integer.parseInt( "3" ) +1); // => 4

    // 5. 문자열을 문자로 변환 - charAt(0) 사용
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(0) - '0');
    System.out.println("5".charAt(0)); // => '5'

    // 6. 문자를 문자열로 변환 - 빈 문자열("")을 더한다
    System.out.println('3' + "");  // => "3"
  }
}
