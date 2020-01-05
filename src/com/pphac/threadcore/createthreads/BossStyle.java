package com.pphac.threadcore.createthreads;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description todo
 */
public class BossStyle {
	public static void main(String[] args) {
		new Thread(new RunnableStyle()){
			@Override
			public void run() {
				System.out.println("Thread");
			}
		}.start();
	}
}
