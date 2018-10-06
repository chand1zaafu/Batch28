package operator.relationoperator;

import java.util.Scanner;

public class BooleanLogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Tom's Age");
        int tomAge = scanner.nextInt();
        ;

        System.out.println("Enter John's Age");
        int johnAge = scanner.nextInt();

        System.out.println("Enter Game Name");
        String gameName = scanner.next();

        boolean isAgeEquals = (tomAge == johnAge);

        /*if(isAgeEquals){

            if("football".equals(gameName)){
                System.out.println("Both the age are same");
                System.out.println("You guys can play football");
            }
        }*/

        if (isAgeEquals && "football".equals(gameName)) {
            System.out.println("Both the age are same");
            System.out.println("You guys can play football");
        }

        if (!isAgeEquals && !"football".equals(gameName)) {
            System.out.println("Guys go for swimming..");
        }

        // (if age is not equals) or (game is football) : ||
        // You guys can play half court football
        if (!isAgeEquals || "football".equals(gameName)) {
            System.out.println("You guys can play half court football");
        }

    }
}