package misc;

public class RecursionExample {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        // 3 : 3 * 2
        // 4 : 4 * 3 * 2

        int result = factorial.fact(0);
        System.out.println(result);

    }
}

class Factorial {
    public int fact(int a){
        if(a <= 1)
            return 1;
        return a * fact(a-1);
    }
}