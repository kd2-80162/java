import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int sum = 0;
        int qty;

        do {
            System.out.println("Enter Your Choices");
            System.out.println("1. Dosa (Rs.60)");
            System.out.println("2. Idli (Rs.55)");
            System.out.println("3. Uttapa (Rs.70)");
            System.out.println("4. Basundi (Rs.50)");
            System.out.println("5. Laddo (Rs.58)");
            System.out.println("6. Masala Papad (Rs.40)");
            System.out.println("7. Omelet (Rs.30)");
            System.out.println("8. Chapati (Rs.15)");
            System.out.println("9. Rice (Rs.70)");
            System.out.println("10. Generate Bill and exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 60;
                    break;
                case 2:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 55;
                    break;
                case 3:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 70;
                    break;
                case 4:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 50;
                    break;
                case 5:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 58;
                    break;
                case 6:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 40;
                    break;
                case 7:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 30;
                    break;
                case 8:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 15;
                    break;
                case 9:
                    System.out.println("Enter Quantity");
                    qty = sc.nextInt();
                    sum += qty * 70;
                    break;
                case 10:
                    System.out.println("The bill is " + sum);
                    System.out.println("Thank you, visit again");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);
    }
}

