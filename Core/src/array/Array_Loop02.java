package array;

/*
    java array.Array_Loop02 one two three
 */
public class Array_Loop02 {
    public static void main(String[] args) {


        int ageBag[] = new int[10];
        ageBag[0] = 10;
        ageBag[1] = 20;
        ageBag[2] = 30;
        ageBag[3] = 40;
        ageBag[4] = 50;
        ageBag[5] = 60;
        ageBag[6] = 70;
        ageBag[7] = 80;
        ageBag[8] = 90;
        ageBag[9] = 10;











        /*
        System.out.print(ageBag[0] +" ");
        System.out.print(ageBag[1]+" ");
        System.out.print(ageBag[2]+" ");
        System.out.print(ageBag[3]+" ");
        System.out.print(ageBag[4]+" ");
        System.out.print(ageBag[5]+" ");
        System.out.print(ageBag[6]+" ");
        System.out.print(ageBag[7]+" ");
        System.out.print(ageBag[8]+" ");
        System.out.print(ageBag[9]+" ");
        System.out.print(ageBag[50]+" ");
        */

        System.out.println(" Age bag Length = "+ageBag.length);

        System.out.println("Staring While Loop");
        int i = 0; // initilization

        while(i < ageBag.length){  /// checking condition
            System.out.print((i) +" "); // incrementing

            //TODO: write code to print the ages
            System.out.println(ageBag[i]);
            i++;
        }

        /*
            For Loop.
         */

        System.out.println("\n ***************");

        System.out.println("Staring For Loop");
        for(int j = 0 ; j < ageBag.length; j++) { // init + condition + increment
            System.out.print((j) +" ");
            System.out.println(ageBag[j]);
            //TODO: write code to print the ages
        }


        System.out.println("Enhanced For loop");
        for(int age : ageBag) {
            System.out.println(age);
        }


        /*
            Do While Loop
         */
        System.out.println("********Do While Loop");
        int k = 0;
        do {
            System.out.println(ageBag[k++]);
        }while (k < ageBag.length);

    }
}