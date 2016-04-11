package PostWithVideo;

public class Demo {

	public static void main(String[] args) {
		for(int i = 0; i<100; i++){
			Citizen ivan = new Citizen("Ivan", "Ivanov", "Nadezhda 132");
			Thread ivanThread = new Thread(ivan);
			ivanThread.start();
		}
		
		

	}

}
