package com.eomcs.app1;

import java.net.Socket;

public class ClientApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[계산기 클라이언트]");

    Socket socket = new Socket("127.0.0.1", 8888);
    System.out.println("서버와 연결되었음!");

    socket.close();
    System.out.println("서버 연결 종료!");
  }

}
