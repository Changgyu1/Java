package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws IOException {
		int port = 3333;
		ServerSocket server;

		server = new ServerSocket(port);
		System.out.println("서버 시작 포트 " + port);
		while (true) {
			Socket client = server.accept();
			System.out.println("cl접속" + client.getInetAddress());
			client.close();

		}
	}
}
