package Thread_Runeable;

public class Thr extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println(Thread.currentThread().getName()+": "+Main.contador++);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
