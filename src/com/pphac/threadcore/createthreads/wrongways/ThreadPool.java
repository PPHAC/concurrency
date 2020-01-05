package com.pphac.threadcore.createthreads.wrongways;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description todo
 */
public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i = 0; i < 1000; ++i) {
			executorService.submit(new Task(){});
		}

	}
}

class Task implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}