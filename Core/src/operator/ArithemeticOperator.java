package operator;

import java.util.Scanner;

public class ArithemeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first Number");
        int a = scanner.nextInt();

        System.out.println("Give the Second Number");
        int b = scanner.nextInt();

        System.out.println("Please enter a message");
        String message = scanner.next();

        int addition = a + b;

        System.out.println(message +" =" +addition);

//        System.out.println("Add " +addition);

    }
}

