package operator.relationoperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Tom's Age");
        int tomAge = scanner.nextInt();;

        System.out.println("Enter John's Age");
        int johnAge = scanner.nextInt();

        boolean isEqual = (tomAge == johnAge);

        System.out.println(isEqual ? "Both the age are same" : "Age is different");

        /*if(isEqual){
            System.out.println("Both the age are same");
        }else {
            System.out.println("Age is different");
        }*/




    }
}




