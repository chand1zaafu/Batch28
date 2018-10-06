package array;

public class Array_01 {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        String johnName = "John";
//        String tomName = "Tom";


        int johnAge = 10; // default value will be zero
        int johnHeight = 6; // default value will be zero

        int tomAge = 23;
        int tomHeight = 5;

        /*
            0   1   2   3   4   5   6   7   8   9
            10                          23          6
         */
        int heightBag[] = {tomHeight, johnHeight};

        int ageBag[] = new int[10];
        ageBag[0] = johnAge;
        ageBag[7] = tomAge;
        ageBag[1] = 50;

        // Compile Time Error
        ageBag[10] = 6; // Runtime Exception

        // can we create an array that expands as the user inputs data

//        System.out.println(ageBag);

        System.out.println(ageBag[0]);
        System.out.println(ageBag[1]);
        System.out.println(ageBag[7]);
    }
}
