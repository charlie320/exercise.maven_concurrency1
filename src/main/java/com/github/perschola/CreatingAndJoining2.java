package com.github.perschola;

class MyThread2 extends Thread {
	public void run() {
			System.out.println("Hello World - " + Thread.currentThread().getName());
	}
}

public class CreatingAndJoining2 {

	public static void main(String[] args) throws InterruptedException {
		Thread[] fiveThreads = new Thread[5];
		for (int i = 0; i < fiveThreads.length; i++) {
			fiveThreads[i] = new MyThread2();
			fiveThreads[i].setName("Thread " + (i + 1));
			fiveThreads[i].start();
			fiveThreads[i].join();
		}
	}
}
