import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
public static int contador=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.submit(new Thr());
		ex.submit(new Thr());
		ex.submit(new Thr());
	}
	
	public static synchronized void sum() {
		contador++;
		System.out.println(contador);
	}
	
	/*public static  void sum() {
		contador++;
		System.out.println(contador);
	}*/

}
