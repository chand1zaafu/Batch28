package classesexample;

/**
 * public private default protected
 */
public class Student {
    private String name;
    private int age;
    private float height;
    private Address address;
    private HeadPhone headPhone;

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

    /*
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 89;
    }
    */


}