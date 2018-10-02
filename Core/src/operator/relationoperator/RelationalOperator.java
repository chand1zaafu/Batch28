package operator.relationoperator;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Tom's Age");
        int tomAge = scanner.nextInt();;

        System.out.println("Enter John's Age");
        int johnAge = scanner.nextInt();

        boolean isEqual = (tomAge == johnAge);

        if(isEqual){
            System.out.println("Both the age are same");
        }else {
            System.out.println("Age is different");
        }


        if(isEqual){
            System.out.println("You guys can go out to play soccer");
        }else {
            System.out.println("Please go and play monopoly");
        }


        if(johnAge > tomAge){
            System.out.println("John is a big guy");

            if(johnAge > 25){
                System.out.println("You are big enough to drive a car");
            }
        }else if(true){

        }else{

        }
        /**
         * >= : greater than equals
         * <= : less than equals
         */

        /*
        int a=34;

        int b=45;

        if (a<=b){

        system.out.println("a is lessthan b")

        }elseif(a>=b){

        system.out.println("a is greaterthan b")

        }else{

        system.out.println("a is equal b")

        }
         */

    }
}
