package CountDawn;

import java.util.concurrent.CountDownLatch;

public class Main {
public static CountDownLatch cdl;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		cdl=new CountDownLatch(3);
		new Suma().start();
		new Resta().start();
		new Multiplicacion().start();
		cdl.await();
		
		System.out.println("HAN ACABAT LES OPERACIONS");
		
	}

}
