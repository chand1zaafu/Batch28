package operator.relationoperator;

public class BooleanLogicalOperator3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        if((a > 15) & (b++ > 10)){
            System.out.println("I am going to watch a movie");
        }

        System.out.println("Value of a : "+ a);
        System.out.println("Value of b : "+ b);


    }
}