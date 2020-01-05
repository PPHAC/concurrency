package com.pphac.threadcore.startthread;

import com.pphac.threadcore.createthreads.ThreadStyle;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description todo
 */
public class StartAndRunMethod {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		runnable.run();
		new Thread(runnable).start();
	}
}
