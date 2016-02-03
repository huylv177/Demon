package com.demologin.thread;

import com.demologin.Constant;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (Constant.THREADRUNNING) {
			System.out.println("hello" + System.currentTimeMillis());
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
