package entities;

import java.util.Scanner;

public class methods {

    public void calc(int option) {
        int num1 = 0;
        int num2 = 0;
        int operation = 0;

        if (option != 0) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            num1 = sc1.nextInt();
            System.out.print("Enter the second number: ");
            num2 = sc1.nextInt();
            operation = 0;

        }
        switch (option) {
            case 1:

                operation = sum(num1, num2);
                break;
            case 2:
                operation = sub(num1, num2);
                break;
            case 3:
                operation = mult(num1, num2);
                break;
            case 4:
                operation = div(num1, num2);
                break;
            default:
                System.exit(0);
        }
        System.out.print("The result of the sum is: " + operation + "\n");
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }
}
