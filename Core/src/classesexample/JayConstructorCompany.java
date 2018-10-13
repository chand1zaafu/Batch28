package classesexample;

public class JayConstructorCompany {
    public void createHouse(){

        TajConstructorCompany tajConstructorCompany = new TajConstructorCompany("John");
        TajConstructorCompany.TajKitchenCompany tajKitchenCompany = tajConstructorCompany.new TajKitchenCompany();

        /*TajConstructorCompany.TajKitchenCompany tajKitchenCompany =
                new TajConstructorCompany("John").new TajKitchenCompany();
        tajKitchenCompany.createDesignerKitchen();*/


    }

}
