package com.eomcs.app1;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[계산기 서버]");

    ServerSocket serverSocket = new ServerSocket(8888);

    System.out.println("클라이언트의 연결을 기다림!");
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트와 연결됨!");

    socket.close();
    System.out.println("클라이언트 연결 종료!");

    serverSocket.close();
    System.out.println("서버 종료!");
  }

}
