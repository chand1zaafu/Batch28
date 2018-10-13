package misc;

public class MainPassByValuePassByReference {
    public static void main(String[] args) {
        MainPassByValuePassByReference ref = new MainPassByValuePassByReference();
        int value = 3;
        ref.add(value); /// pass by value
        System.out.println(value);

        Phone iphone = new Phone("IPhone");
        System.out.println(iphone.getName());

        ref.changeName(iphone); // pass by Reference --> value
        System.out.println(iphone.getName());
    }

    public void add(int a){
        a = 10;
    }

    public void changeName(Phone phone){
        phone.setName("Samsung");
    }
}

class Phone {
    private String name;

    public Phone(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
