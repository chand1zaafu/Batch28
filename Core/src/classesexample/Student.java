package classesexample;

/**
 * public private default protected
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private float height;
    private Address address;
    private HeadPhone headPhone;

    public Student(){
    }

    public Student(int idX){
        id = idX;
    }

    public Student(int id , String name) {
//        this.id = id;
        this(id);
        this.name = name;
    }

    public Student(int id , String name , int age){
        this(id,name);
        this.age = age;
    }

    public Student(int id , String name , int age, float height){
        this(id,name,age);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HeadPhone getHeadPhone() {
        return headPhone;
    }

    public void setHeadPhone(HeadPhone headPhone) {
        this.headPhone = headPhone;
    }

    public int getAge(){
        return age;
    }



    public void setAge(int ageX){
        if(ageX < 5) {
            age = 5;
        }else {
            age =  ageX;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    /*
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 89;
    }
    */

    /*public void printInfo(){
        System.out.println(this.getId() +" "+ this.getName() +" "+ this.getHeight());
    }*/


    public String toString() {
        return (this.getId() +" "+ this.getName() +" "+ this.getHeight());
    }
}