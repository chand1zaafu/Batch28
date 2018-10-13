package classesexample;


//import java.lang.Math;


public class MainVariableTypes {

    // MainVariableTypes obj = new MainVariableTypes();
    // obj.main();
    // MainVariableTypes.main()

    public static void main(String[] args) {
        Employee employee1 = new Employee(100);
        Employee.company = "MicCompany";

        System.out.println("employee1.company "+employee1.company);

        Employee employee2 = new Employee(101);

//        System.out.println(employee2.getId());

        System.out.println("employee2.company "+employee2.company);

        System.out.println(Employee.count);

        callMe();

        System.out.println(Math.pow(2,2));

        String name = "";


    }

    public static void callMe(){
        System.out.println("Print me");
    }

    public void callMeNoStatic(){
        callMe();
    }
}
