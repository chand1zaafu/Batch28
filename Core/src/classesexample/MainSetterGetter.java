package classesexample;

/*
    Client


 */
public class MainSetterGetter {

    public static void main(String[] args) {
        Student student = new Student();
//        student.age = -20; // I don't want anyone to misuse the variable
//        student.height = 90; //

//        System.out.println("Student Age is = "+ 20);


//        if(student.age > 17) {
//            System.out.println("Eligible for Colleage");
//        }

//        student.age = -100;
//        System.out.println(student.age);

        student.setAge(-10);
        student.setAge(-10);

        System.out.println(student.getAge());
    }
}