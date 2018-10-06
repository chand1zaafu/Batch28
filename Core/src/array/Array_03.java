package array;

public class Array_03 {
    public static void main(String[] args) {

        int tomAge = 23;
        int tomHeight =6;

        int tomDetail[] = {tomAge,tomHeight,99};
        System.out.println("Tom Age "+ tomDetail[0] +" Tom Height "+ tomDetail[1]);

        int peterAge = 25;
        int peterHeight =5;

        int peterDetail[] = {peterAge,peterHeight,56,30};

        int personDetails2D[][] ={tomDetail,peterDetail};
       /*
       int personDetails2D[][] = new int[2][6];
       personDetails2D[0][0] = tomAge;
       personDetails2D[0][1] = tomHeight;
       personDetails2D[0][2] = 99;

        personDetails2D[1][0] = peterAge;
        personDetails2D[1][1] = peterHeight;
        personDetails2D[1][2] = 56;
        */

        System.out.println("Length of 2D array : "+ personDetails2D.length);
        /*
            Loop a two D array
         */
        for(int i =0 ; i < personDetails2D.length;i++) {

            for(int j = 0 ; j < personDetails2D[i].length;j++){
                System.out.print(personDetails2D[i][j] +" ");
            }
            System.out.println("\n");
        }
    }
}