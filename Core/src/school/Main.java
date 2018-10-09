package school;

import classesexample.HeadPhone;
import classesexample.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setHeight(4.5f);

        System.out.println("Printing information about "+ student.getName()+"*****");
        System.out.println("Name : "+ student.getName());
        System.out.println("Height : "+student.getHeight());

        Student student1 = new Student();
        student1.setName("Peter");
        student1.setHeight(5.5f);

        System.out.println("Printing information about "+ student1.getName()+"*****");
        System.out.println("Name : "+ student1.getName());
        System.out.println("Height : "+student1.getHeight());


        Student student2 = new Student();
        student2.setName("Ben");
        student2.setHeight(5.6f);


        System.out.println("Printing information about "+ student2.getName()+"*****");
        System.out.println("Name : "+ student2.getName());
        System.out.println("Height : "+student2.getHeight());

        Main main = new Main();

        main.printInfo(student);
        main.printInfo(student1);
        main.printInfo(student2);


        String message = "Hello ";
        String returnedMessage = main.getMessage(student);

        message = message + returnedMessage;

        /*if (student.getHeight() < 6) {
            message += " " + student.getName() +" You got less Height";
        }*/

        System.out.println(message);

        message = "Hello ";
        message += main.getMessage(student1);

        /*if (student1.getHeight() < 6) {
            message += " " + student1.getName() +" You got less Height";
        }*/
        System.out.println(message);

    }

    public String getMessage(Student student) {
        String message = "";
        if (student.getHeight() < 6) {
            message += " " + student.getName() +" You got less Height";
        }
        return message;
    }

    public void printInfo(Student student){
        System.out.println("Printing information about "+ student.getName()+"*****");
        System.out.println("Name : "+ student.getName());
        System.out.println("Height : "+student.getHeight());

    }


    /**
     * call add(3,4) and get the return value and add it to a different number.
     * @param a
     * @param b
     * @return
     */
    public int add(int a , int b){
        return a + b;
    }



}
