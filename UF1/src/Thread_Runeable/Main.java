package Thread_Runeable;

public class Main {
public static int contador;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contador=0;
		for(int i=0; i<3;i++)
			new Thr().start();
			
		//COM FARIEU PERQUE NO REPETEIXIN NUMEROS O ES SALTIN NUMEROS?
			
	}

}
