package ExecutorWithInteruption;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadd extends Thread{
	ExecutorService executor = Executors.newFixedThreadPool(10);
	//ExecutorService executor2 = Executors.newCachedThreadPool();
	public void run() {
		for(int i=0; i<10;i++)
			executor.execute(new Timer());

		
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Falten "+(5-1));
		}
		executor.shutdownNow();
		try {
			executor.awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xecutor.notifyAll();
		System.out.println("He acabado");
	}
}
