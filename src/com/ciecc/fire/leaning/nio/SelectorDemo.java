package com.ciecc.fire.leaning.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorDemo {

	public static void main(String[] args) throws IOException {
		// 通过调用Selector.open()方法创建一个Selector
		Selector selector = Selector.open();

		// 为了将Channel和Selector配合使用，必须将channel注册到selector上。
		SocketChannel channel = SocketChannel.open();
		// 如果SocketChannel在非阻塞模式下，此时调用connect()，该方法可能在连接建立之前就返回了
		channel.configureBlocking(false);
		channel.connect(new InetSocketAddress("http://jenkov.com", 80));

		// 为了确定连接是否建立，可以调用finishConnect()的方法
		while (!channel.finishConnect()) {
			// wait, or do something else...
		}

		// 通过SelectableChannel.register()方法来实现
		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);

		while (true) {
			int readyChannels = selector.select();
			if (readyChannels == 0)
				continue;
			Set selectedKeys = selector.selectedKeys();
			Iterator keyIterator = selectedKeys.iterator();
			while (keyIterator.hasNext()) {
				key = (SelectionKey) keyIterator.next();
				if (key.isAcceptable()) {
					// a connection was accepted by a ServerSocketChannel.
				} else if (key.isConnectable()) {
					// a connection was established with a remote server.
				} else if (key.isReadable()) {
					// a channel is ready for reading
				} else if (key.isWritable()) {
					// a channel is ready for writing
				}
				keyIterator.remove();
			}
		}

	}

}
