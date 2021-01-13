import entities.methods;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        methods c = new methods();

        int option = 5;
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("--Choose an option--");
        System.out.println();
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("0 - Exit");
        System.out.print("Operation: ");

        option = sc.nextInt();

        if (option == 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = sc1.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc1.nextInt();
            int operation = c.sum(num1, num2);
            System.out.print("The result of the sum is: " + operation);

        }
        else if (option == 2) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = sc1.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc1.nextInt();
            int operation = c.sub(num1, num2);
            System.out.print("The result of the subtraction is: " + operation);
        }
        else if (option == 3) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = sc1.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc1.nextInt();
            int operation = c.mult(num1, num2);
            System.out.print("The result of the multiplication is: " + operation);
        }
        else if (option == 4) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = sc1.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc1.nextInt();
            int operation = c.div(num1, num2);
            System.out.print("The result of the division is: " + operation);
        }
        else
            System.exit(0);

    }
}