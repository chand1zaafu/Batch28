package classesexample;

public class Main {

    public static void main(String[] args) {

        Student danny = new Student();
        Student john = new Student(); // this creates an object in the memory

        john.name = "John";
        john.age = 34;
        john.height = 5.5f;
        john.address1 = " Pete Street";
        john.address2 = "Lane 1";
        john.pin = 55555;
        john.state = "NJ";
        john.country = "USA";

//        Student johnRef = john;

        Student tom = new Student(); // this creates an object in the memory

        tom.name = "Tom";
        tom.age = 35;
        tom.height = 6.5f;
        tom.address1 = "Roland Street";
        tom.address2 = "Lane 10";
        tom.pin = 55545;
        tom.state = "VA";
        tom.country = "USA";


        System.out.println(john.age+" "+ john.name);
        System.out.println(tom.age+" "+ tom.name);
        System.out.println(danny.age+" "+ danny.name);

//        System.out.println(tom);
//        System.out.println(danny);

    }
}

class Student {
    String name;
    int age;
    float height;
    String address1;
    String address2;
    int pin;
    String state;
    String country;

}
