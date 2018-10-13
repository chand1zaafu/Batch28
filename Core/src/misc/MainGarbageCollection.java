package misc;

import classesexample.HeadPhone;
import classesexample.Student;

public class MainGarbageCollection {
    public static void main(String[] args) {

/*        Mouse one = new Mouse("Mouse01");
        Mouse two = new Mouse("Mouse02");
        Mouse three = new Mouse("Mouse03");
        Mouse four = new Mouse("Mouse04");

        Student student = new Student();
        // 5000

        one = null;
        three = null;
        System.gc(); /// 6000


        // 10,000


        HeadPhone phone = new HeadPhone();
        System.out.println(two.getName());*/

        for(int i=0 ; i < 500000; i++) {
            new Mouse("Mouse"+i);
        }
    }
}

class Mouse {
    private String name;

    Mouse(String name) {
        this.name = name;
//        System.out.println("Object Created " +  this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        // gets a reference to a the actual printer...
    }

    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed "+ name);
        // detach the remote controler from you..
        //
    }
}
