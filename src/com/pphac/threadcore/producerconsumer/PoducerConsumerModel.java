package com.pphac.threadcore.producerconsumer;

import java.util.ArrayList;

/**
 * @Author pphac
 * @Date 2019/11/27
 * @Description todo
 */
public class PoducerConsumerModel {

	class Producer implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; ++i) {
			}
		}
	}

	class EventStorage {
		private int maxSize;
		public EventStorage() {
			maxSize = 10;
		}
	}
}
