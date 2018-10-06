package array;

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to create dynamic Array");

        int total = scanner.nextInt();


        int ages[] = new int[total]; // 5


        ages[0] = 12;


        // chk if the size of the array is greater than the value 10;
        // if the size is less
        // create a new array
        // then copy all the value of old array into the new array
        // then add the new value.

        ages[10] = 23;
    }
}
