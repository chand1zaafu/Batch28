package array;

public class Array_04 {
    public static void main(String[] args) {

        int ageBag[] = new int[10];
        ageBag[0] = 10;
        ageBag[1] = 20;
        ageBag[2] = 30;
        ageBag[3] = 40;
        ageBag[4] = 50;
        ageBag[5] = 65;
        ageBag[6] = 70;
        ageBag[7] = 80;
        ageBag[8] = 90;
        ageBag[9] = 10;























        // Check if age 65 is present
        /*boolean isAgePresent = false;
        for (int age: ageBag){
            if(age == 112){
                isAgePresent = true;
                break;
            }
        }

        if (isAgePresent){
            System.out.println("Search Result Found");
        }else{
            System.out.println("Search not Found");
        }*/




        for (int age: ageBag){
            if (age == 65)
                continue;
            System.out.print(age +" ");
            System.out.println();
            System.out.println();
        }






    }
}