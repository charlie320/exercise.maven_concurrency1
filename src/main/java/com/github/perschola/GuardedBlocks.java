package com.github.perschola;

class IncrementAndPrint implements Runnable {

	@Override
	public void run() {
		
	}
	
}

public class GuardedBlocks {
	public static void main(String[] args) {
		Runnable r = new IncrementAndPrint();
		Thread threadOne = new Thread(r);
		Thread threadTwo = new Thread(r);
		
		
	}
}
