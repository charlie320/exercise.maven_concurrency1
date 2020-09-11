package com.github.perschola;

class MyThread3 implements Runnable {
	public void run() {
			System.out.println("Hello World - " + Thread.currentThread().getName());
	}
}

public class CreatingAndJoining3 {

	public static void main(String[] args) throws InterruptedException {
		Thread[] fiveThreads = new Thread[5];
		for (int i = 0; i < fiveThreads.length; i++) {
			Runnable r = new MyThread3();
			fiveThreads[i] = new Thread(r);
			fiveThreads[i].setName("Thread " + (i + 1));
			fiveThreads[i].start();
			fiveThreads[i].join();
		}
	}
}
