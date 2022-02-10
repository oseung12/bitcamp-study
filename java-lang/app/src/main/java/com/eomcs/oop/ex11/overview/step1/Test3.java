package com.eomcs.oop.ex11.overview.step1;

public class Test3 {
  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.offer("홍길동");
    myQueue.offer("임꺽정");
    myQueue.offer("유관순");
    myQueue.offer("안중근");
    myQueue.offer("윤봉길");
    myQueue.offer("김구");

    while (myQueue.size() > 0) {
      System.out.println(myQueue.poll());  // 처음부터 순서대로 꺼낸다.
    }
    System.out.println(myQueue.size());
  }
}
