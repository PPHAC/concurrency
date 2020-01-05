package com.pphac.threadcore.stopthread;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description
 */
public class RightWayStopThread implements Runnable{
	@Override
	public void run() {
		while (true) {
			System.out.println("go");
			try {
				throwInMethod();
			} catch (InterruptedException e) {
				System.out.println("保存日志");
				e.printStackTrace();
			}
		}
	}

	private void throwInMethod() throws InterruptedException{

		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException{
		Thread thread =  new Thread(new RightWayStopThread());
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
	}
}