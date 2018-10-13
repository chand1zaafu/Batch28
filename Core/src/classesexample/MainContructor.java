package classesexample;

public class MainContructor {
    public static void main(String[] args) {
        Student john = new Student(100);
//        System.out.println(john.getId());
        john.setName("John");

//        System.out.println(john.getId() +" "+ john.getName() +" "+ john.getHeight());

        Student peter = new Student(101,"Peter");
//        System.out.println(peter.getId() +" " + peter.getName());


        Student meera = new Student(103,"Meera",25,5.6f);

//        System.out.println(meera.getId() +" "+ meera.getName() +" "+ meera.getHeight());

        System.out.println(meera);

    }
}
