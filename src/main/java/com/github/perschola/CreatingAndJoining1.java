package com.github.perschola;

class MyThread extends Thread {
	public void run() {
		System.out.println("Hello World - " + Thread.currentThread().getName());
	}
}

public class CreatingAndJoining1 {

	public static void main(String[] args) {
		Thread myThread = new MyThread();
		myThread.start();
	}

}
