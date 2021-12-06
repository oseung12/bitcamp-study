// 리터럴: 문자 리터럴
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam5") //경로명은 package 및 class 명과 다르게 저장할수있다.
public class Exam5 {

  @GetMapping("/test1")
  public String test1() {
    return "문자1: " + 'A' + '가';
  }

  @GetMapping("/test2")
  public String test2() {
    return "문자2: " + '\u0041' + '\uac00'; //문자에 대한 유니코드 값을 지정해도 된다.
  }

  // type casting(형변환)_ char
  @GetMapping("/test3")
  public String test3() {
    return "문자3: " + (char)0x41 +"," + (char)0xac00; //문자 코드(UTF-16)를 숫자로 정수 값으로 지정한다. 
    //대신 문자를 가리키는 코드임을 표시해야한다. 
    //문자코드 작성이 안될시 [문자3: 65,44032 ] 10진수로 정수 값이 출력된다.
  }

  @GetMapping("/test4")
  public String test4() {
    return "문자4: " + (char)65 +"," + (char)44032; //문자의 코드 값은 그냥 정수 값이다.
    //대신 문자를 가리키는 코드임을 표시해야한다.
  }

  @GetMapping("/test5")
  public String test5() {
    return "문자5: " + '\u4eba'+ ","+ '\u03c0'; // 키보드에서 입력 불가능한 특수 문자를 입력할때 유니코드를 주로 사용한다.

  }
}
