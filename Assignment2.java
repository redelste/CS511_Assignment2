package Assignment2;

import java.util.Random;
import java.util.concurrent.Semaphore;

/** start the simulation */
public class Assignment2 {
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();

		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto - generated catch block
			
			e.printStackTrace();
		}
	}
}
