package CountDawn;

public class Multiplicacion extends Thread{
	public void run() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": 3*2="+(3*2));
		Main.cdl.countDown();
	}
}
