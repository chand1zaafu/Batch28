package operator.relationoperator;

public class BooleanLogicalOperator2 {
    public static void main(String[] args) {
        int a = 16;
        int b = 5;

        /*if((a > 15) && (b++ > 10)){
            System.out.println("I am going to watch a movie");
        }

        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);*/


        a = 10;
        b = 5;
        if((a > 15) && (b++ > 10)){
            System.out.println("I am going to watch a movie");
        }

        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);

        boolean one = a > 15;
        boolean two = b > 10;
        if(one & two){
            System.out.println("help");
        }
    }
}

/*              8421
            0 = 0000
            1 = 0001
            2 = 0010

            3 = 0011
            4 = 0100
            ---------
                0111

*/