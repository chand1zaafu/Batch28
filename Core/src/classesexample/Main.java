package classesexample;

public class Main {

    public static void main(String[] args) {

//        Student danny = new Student();

        Student johnObject = new Student(); // this creates an object in the memory

        johnObject.setName("John");
        johnObject.setAge(35);
        johnObject.setHeight(4.5f);

        Address johnAddress = new Address();
        HeadPhone johnHeadPhone = new HeadPhone();
        johnHeadPhone.brand = "Sony";

        // TODO : what should i be doing in this line to associate headphone with John ?
        johnObject.setHeadPhone(johnHeadPhone);

        johnAddress.address1 = " Pete Street";
        johnAddress.address2 = "Lane 1";
        johnAddress.pin = 55555;
        johnAddress.state = "NJ";
        johnAddress.country = "USA";

//        johnObject.address = johnAddress;

//        Student johnRef = johnObject;

        Student tomObject = new Student(); // this creates an object in the memory

//        tomObject.name = "Tom";
//        tomObject.age = 35;
//        tomObject.height = 6.5f;

        Address tomAddress = new Address();

        tomAddress.address1 = "Roland Street";
        tomAddress.address2 = "Lane 10";
        tomAddress.pin = 55545;
        tomAddress.state = "VA";
        tomAddress.country = "USA";
//        tomObject.address = tomAddress;

//        System.out.println(johnObject.age+" "+ johnObject.name);
//        System.out.println(tomObject.age+" "+ tomObject.name);

        System.out.println("*****Address******");

//        System.out.println(johnObject.address.address1);
//        System.out.println(johnObject.address.address2);

//        System.out.println(tomObject.address.address1);
//        System.out.println(tomObject.address.address2);

    }
}

/**
 * This class is a template
 */




