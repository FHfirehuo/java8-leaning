package com.ciecc.fire.leaning.io.file.breakpoint;

public class DownUtilTest {

	public static void main(String[] args) throws Exception {
		final DownUtil downUtil = new DownUtil(
				"http://apache.mirrors.hoobly.com/tomcat/tomcat-9/v9.0.1/src/apache-tomcat-9.0.1-src.zip",
				"apache-tomcat-9.0.1-src.zip", 3);

		downUtil.download();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (downUtil.getCompleteRate() < 1) {
					System.out.println("已完成:" + downUtil.getCompleteRate());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		}).start();

	}

}
