package com.knou.study;

import java.util.Scanner;

public class InputOutput {

  public static class StudentInfo {
    public static String name ;
    public static int first ;
    public static int second ;
    public static String etc;

    public StudentInfo(){   
    }
  }

  public static void input_info() {
    Scanner sc = new Scanner(System.in);

    System.out.println("학번 앞 6자리를 입력하세요");
    StudentInfo.first=sc.nextInt();

    System.out.println("'-'를 입력하세요");
    StudentInfo.etc = sc.next();

    System.out.println("학번 뒤 6자리를 입력하세요");
    StudentInfo.second = sc.nextInt();

    System.out.println("이름을 입력하세요");
    StudentInfo.name = sc.next();
  }

  public static void output_info() {
    System.out.println("입력된 학번 전체는 "+StudentInfo.first+StudentInfo.etc+StudentInfo.second+" 입니다.");
    System.out.println("입력된 이름은 " + StudentInfo.name +" 입니다.");        
  }   

  public static void main(String[] args) {
    input_info();
    output_info();
  }
}