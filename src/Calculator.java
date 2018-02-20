
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		double sum, sub, mul, div, rem;						
		Scanner input = new Scanner(System.in);
						
		System.out.println("Enter a first number");
		int a = input.nextInt();
		System.out.println("Enter a second number");
		int b = input.nextInt();
						
		System.out.println("What operation would you like to perform?\n");
		System.out.println("\tEnter '1' for addition.");
		System.out.println("\tEnter '2' for subtraction.");
		System.out.println("\tEnter '3' for multiplication.");
		System.out.println("\tEnter '4' for division.\n");
			
		System.out.print("Choose from the above operations: ");
		int answer = input.nextInt();
								
								
			if (answer == 1){
				sum = addt(a, b);
				System.out.println("When added " + a + " plus " + b +  " equals " + sum);				
				}
			else if (answer == 2){
				sub = subt(a, b);	
				System.out.println("When subtracted " + a + " minus " + b +  " equals " + sub);
				}
			else if (answer == 3){
				mul = mult(a, b);
				System.out.println("When multiplied " + a + " and " + b +  " equals " + mul);
				}
			else if (answer == 4){
				div = divd(a, b);	
				rem = remd(a, b);
				System.out.println("When divided " + a + " and " + b +  " equals " + div + " with a remainder of " + rem);
				}
			else{}
				
	}//main
			

		public static double addt(int A, int B){
		
			double C = (A + B);
			return C;
		}
		public static double subt(int A, int B){
			
			double C = (A - B);
			return C;
		}
		public static double mult(int A, int B){
			
			double C = (A * B);
			return C;
		}
		public static double divd(int A, int B){
			
			double C = (A / B);
			return C;
		}
		public static double remd(int A, int B){
			
			double C = (A % B);
			return C;
		}
	

				
}//class
