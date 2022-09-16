package Thread_Runeable;

public class Main2 {
	public static int contador;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contador=0;
		for(int i=0; i<3;i++)
			new Run().run();
	}

}
