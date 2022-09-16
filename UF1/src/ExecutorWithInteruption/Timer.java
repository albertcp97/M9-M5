package ExecutorWithInteruption;

public class Timer implements Runnable{

	public int tiempo;
	public int tiempo_actual;
	
	
	public Timer() {
		super();
		this.tiempo = (int) (Math.random()*10+1);
		this.tiempo_actual = 0;
	}


	@Override
	public void run() {
		try {// TODO Auto-generated method stub
		for(int i=0;i<tiempo;i++) {
			
				Thread.sleep(1000);
			
			System.out.println(Thread.currentThread().getName()+" ME FALTAN "+ (tiempo-tiempo_actual));
			tiempo_actual++;
			}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("PARO");
			}
	}

}
