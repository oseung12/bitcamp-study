// 디렉토리에 들어 있는 파일이나 하위 디렉토리 정보 알아내기 II
package com.eomcs.io.ex01;

import java.io.File;
import java.sql.Date;

public class Exam0520 {

  public static void main(String[] args) throws Exception {

    File dir = new File(".");

    // 파일이나 디렉토리 정보를 File 객체로 받기
    // => File은 디렉토리와 파일을 통칭하는 용어다.
    // 디렉토리의 파일목록(디렉토리 포함)을 File배열로 반환한다.
    File[] files = dir.listFiles();   

    for (File file : files) {
      System.out.printf("%s   %s %12d %s\n",
          file.isDirectory() ? "d" : "-",   // 조건 연산자 => 만약에 true면 "d" false면 "-"
              new Date(file.lastModified()),   // 마지막 저장날짜 
              file.length(),
              file.getName());
    }

  }

}


