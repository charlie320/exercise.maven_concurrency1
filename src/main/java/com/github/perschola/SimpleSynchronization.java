package com.github.perschola;

class IncrementInteger implements Runnable {
	private static Integer num = 0;

	@Override
	public void run() {
		synchronized (IncrementInteger.class) {
			for (int i = 0; i < 1000000; i++) {
				IncrementInteger.incrementInteger();
			}
			System.out.println(IncrementInteger.getNum());
		}

	}

	public static void incrementInteger() {
		num++;
	}

	public static Integer getNum() {
		return num;
	}
}

public class SimpleSynchronization {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new IncrementInteger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.start();
//		one.join();
		two.start();
	}

}
