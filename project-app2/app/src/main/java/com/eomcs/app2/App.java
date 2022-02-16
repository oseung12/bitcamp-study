package com.eomcs.app2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

  Scanner keyScan = new Scanner(System.in);
  ArrayList<Score> scores = new ArrayList<>();

  public static void main(String[] args) {
    new App().service();
  }

  public void service() {

    while (true) {
      printMenu();
      String input = promptString("명령> ");

      if (checkQuit(input)) {
        break;
      }

      try {
        switch (input) {
          case "1": createScore(); break;
          case "2": listScore(); break;
          case "3": detailScore(); break;
          case "4": updateScore(); break;
          case "5": deleteScore(); break;
          default:
            System.out.println("올바른 메뉴 번호를 입력하세요!");
        }
      } catch (Exception e) {
        System.out.println("실행 중 오류 발생: " + e.getMessage());
      }

      System.out.println();
    }

    System.out.println("종료!");
    keyScan.close();
  }

  private void printMenu() {
    System.out.println("메뉴:");
    System.out.println("1. 등록");
    System.out.println("2. 목록");
    System.out.println("3. 상세");
    System.out.println("4. 변경");
    System.out.println("5. 삭제");
  }

  private String promptString(String title) {
    System.out.print(title);
    return keyScan.nextLine();
  }

  private int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }

  private boolean checkQuit(String input) {
    return input.equals("quit") || input.equals("exit");
  }

  private void createScore() {
    Score score = new Score();
    score.setName(promptString("이름? "));
    score.setKor(promptInt("국어? "));
    score.setEng(promptInt("영어? "));
    score.setMath(promptInt("수학? "));

    scores.add(score);
  }

  private void listScore() {
    int count = 0;
    for (Score score : scores) {
      System.out.printf("%d: %s, %d, %d, %d, %d, %.1f\n",
          count++,
          score.getName(), 
          score.getKor(),
          score.getEng(),
          score.getMath(),
          score.getSum(),
          score.getAverage());
    }
  }

  private void detailScore() {
    int no = promptInt("번호? ");
    if (no < 0 || no >= scores.size()) {
      System.out.println("번호가 유효하지 않습니다.");
      return;
    }

    Score score = scores.get(no);
    System.out.printf("이름: %s\n", score.getName());
    System.out.printf("국어: %d\n", score.getKor());
    System.out.printf("영어: %d\n", score.getEng());
    System.out.printf("수학: %d\n", score.getMath());
    System.out.printf("합계: %d\n", score.getSum());
    System.out.printf("평균: %.1f\n", score.getAverage());
  }

  private void updateScore() {
    int no = promptInt("번호? ");
    if (no < 0 || no >= scores.size()) {
      System.out.println("번호가 유효하지 않습니다.");
      return;
    }

    Score old = scores.get(no);

    Score score = new Score();
    score.setName(promptString(String.format("이름(%s)? ", old.getName())));
    score.setKor(promptInt(String.format("국어(%d)? ", old.getKor())));
    score.setEng(promptInt(String.format("영어(%d)? ", old.getEng())));
    score.setMath(promptInt(String.format("수학(%d)? ", old.getMath())));

    scores.set(no, score);
  }

  private void deleteScore() {
    int no = promptInt("번호? ");
    if (no < 0 || no >= scores.size()) {
      System.out.println("번호가 유효하지 않습니다.");
      return;
    }
    scores.remove(no); 
  }
}

