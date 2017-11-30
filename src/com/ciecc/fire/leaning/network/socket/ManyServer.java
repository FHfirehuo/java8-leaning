package com.ciecc.fire.leaning.network.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ManyServer {

	public static void main(String[] args) throws IOException {
		// ============================================
		// 服务器代码
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(10086);
		Socket socket = null;
		int count = 0;// 记录客户端的数量
		while (true) {
			socket = serverSocket.accept();
			serverThread serverThread = new serverThread(socket);
			serverThread.start();
			count++;
			System.out.println("客户端连接的数量：" + count);
		}
	}
}
