import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
	     System.out.println("The num is="+num);
	     System.out.println("Binary Equivalent"+Integer.toBinaryString(num));
	     System.out.println("Octal equivalent :"+Integer.toOctalString(num));
	     System.out.println("Hexdecimal Equivalent :"+Integer.toHexString(num));
	}

}
