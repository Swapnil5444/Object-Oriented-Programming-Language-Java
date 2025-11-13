package loop;
import java.util.Scanner;

public class DemoDoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Register");
            System.out.println("2. Find");
            System.out.println("3. FindAll");
            System.out.println("4. Delete");
            System.out.println("5. Update");
            System.out.println("-1. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Register");
                    break;
                case 2:
                    System.out.println("Find");
                    break;
                case 3:
                    System.out.println("FindAll");
                    break;
                case 4:
                    System.out.println("Delete");
                    break;
                case 5:
                    System.out.println("Update");
                    break;
                case -1:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("INCORRECT VALUE");
            }

        } while (choice != -1);

        System.out.println("Program Exit Successfully");
        sc.close();
    }
}

 		
