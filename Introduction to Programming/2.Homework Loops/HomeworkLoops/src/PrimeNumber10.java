import java.util.Scanner;

public class PrimeNumber10 {

	public static void main(String[] args) {
		System.out.println("Enter a positive number for check is it prime:");
		Scanner sc = new Scanner(System.in);
		int numberForCheck = sc.nextInt();
		while(numberForCheck<=0){
			System.out.println("Please enter a positive number:");
			numberForCheck = sc.nextInt();
		}
		int counter = 0;
		for (int i = 2; i <= numberForCheck/2; i++) {
			if(numberForCheck%i == 0){
				System.out.println("This number is not prime");
				counter++;
				break;
			} 
			
		}
		if(counter == 0){
			System.out.println("This number is prime!");
		}
		
	}

}
