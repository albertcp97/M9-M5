package CountDawn;

public class Resta extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+": 3-2="+(3-2));
		Main.cdl.countDown();
	}
}
