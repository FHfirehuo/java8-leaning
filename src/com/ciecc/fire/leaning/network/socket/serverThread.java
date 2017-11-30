package com.ciecc.fire.leaning.network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class serverThread extends Thread {
	// 服务器线程处理
	// 和本线程相关的socket
	Socket socket = null;

	//
	public serverThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			// 服务器处理代码
			// 3、获取输入流，并读取客户端信息
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("我是服务器，客户端说：" + info);
			}
			socket.shutdownInput();// 关闭输入流
			// 4、获取输出流，响应客户端的请求
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			pw.write("欢迎您！");
			pw.flush();
			pw.close();
			//socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
