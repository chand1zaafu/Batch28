package classesexample;

/**
 * Plain Old Java Object
 */
class Employee {
    private int id;
    private Address address;

    public static String company = "Home";
    static public int count;

    static {
        System.out.println("This is my Static Block");
    }

    public Employee(){
        System.out.println("This is my Default Constructor");
    }

    public Employee(int id){
        this.id = id;
        count++;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
