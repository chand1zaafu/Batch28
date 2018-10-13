package misc;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
//        int value = methodOverloading.add(3,4);
//        System.out.println(value);
//
//        value = methodOverloading.add(3,2,4);
//        System.out.println(value);

        int value = 3;
        methodOverloading.add(value);
        System.out.println(value);

        methodOverloading.add(1);
        methodOverloading.add("1");


        int a = 10;
        a  = 20;

        final int b = 34;
    }


    public void add(int a){
        a = 10;
    }

    public void add(String a){

    }

    /*public int addTwoNumber(int a , int b){
        return a + b;
    }

    public int addThreeNumber(int a , int b, int c){
        return addTwoNumber(a,b) +  c;
    }*/


    public int add(int a , int b){
        return a + b;
    }

    public int add(int a , int b, int c){
        return add(a,b) +  c;
    }


    /*public void add(int a , int b, int c){
        System.out.println();
    }*/







}


