import entities.methods;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        while (true) {

            System.out.println("--Choose an option--");

            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("1 - Sum");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("0 - Exit");
            System.out.print("Operation: ");


            new methods().calc(sc.nextInt());
        }
    }
}