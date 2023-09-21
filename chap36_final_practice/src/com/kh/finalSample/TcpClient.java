package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		int port = 3333;
		String serverIP;



			try {
				serverIP = InetAddress.getLocalHost().getHostAddress();
				System.out.println("serverIP" + serverIP);
				Socket socket = new Socket(serverIP, port);
				System.out.println("Server connect");
				
				//Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ��
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				OutputStream out = socket.getOutputStream();
				
				// Ŭ���̾�Ʈ���� ������ �޼��� ����
				String msg = "�ȳ��ϼ���";
				out.write(msg.getBytes());
				out.flush();
																												
				socket.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}