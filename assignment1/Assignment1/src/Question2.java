import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		double num1;
		double num2;
		
		Scanner sc=new Scanner(System.in);
		
		 {
			num1 = sc.nextDouble();
			if(sc.hasNextDouble() && !sc.hasNextInt()) {
				num2 = sc.nextDouble();
				double avg = (num1 + num2)/2;
				System.out.println("The avg is "+avg);
			} else {
				System.out.println("enter valid value");
			}
			
		} 
		
		
	}

}
