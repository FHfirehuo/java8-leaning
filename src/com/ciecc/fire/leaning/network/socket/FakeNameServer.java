package com.ciecc.fire.leaning.network.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FakeNameServer {

	public static final int PORT = 8080;

	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		try {
			server = new ServerSocket(PORT);
			Socket socket = null; // 创建线程池和消息队列都是有界的，因此无论有多少个客户并发连接数量有多大，都不会把系统资源消耗完,指定线程池和任务队列大小。
			NameServerHandlerExecutePool singleExecutor = new NameServerHandlerExecutePool(100, 1000);
			while (true) {
				socket = server.accept();
				// 把任务交给线程执行器
				singleExecutor.execute(new HandlerClientRunnable(socket));
			}
		} finally {
			if (server != null) {
				server.close();
				server = null;
			}
		}
	}
}
