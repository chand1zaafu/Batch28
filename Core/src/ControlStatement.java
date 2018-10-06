public class ControlStatement {
    public static void main(String[] args) {
        // if
        // if else


        int month = 9;

        /*if(month == 1){
            System.out.println("This is Jan");
        }else if(month == 2){
            System.out.println("This is Feb");
        }else if(month == 3){
            System.out.println("This is March");
        }else if(month == 4){
            System.out.println("This is Apr");
        }else if(month == 5){
            System.out.println("This is May");
        }else if(month == 6){
            System.out.println("This is JUne");
        }else if(month == 7){
            System.out.println("This is July");
        }else if(month == 8){
            System.out.println("This is Aug");
        }else if(month == 9){
            System.out.println("This is Sep");
        }else if(month == 10){
            System.out.println("This is Oct");
        }else if(month == 11){
            System.out.println("This is Nov");
        }else if(month == 12){
            System.out.println("This is Dec");
        }*/


        switch (month){
            case 1: {
                System.out.println("This is Jan"); break;
            }
            case 2: {
                System.out.println("This is Feb"); break;
            }
            case 3: {
                System.out.println("This is March"); break;
            }
            case 4: {
                System.out.println("This is Apr"); break;
            }
            case 5: {
                System.out.println("This is May"); break;
            }
            case 6: {
                System.out.println("This is JUne"); break;
            }
            case 7: {
                System.out.println("This is July"); break;
            }
            case 8: {
                System.out.println("This is Aug"); break;
            }
            case 9: {
                System.out.println("This is Sep"); break;
            }
            case 10: {
                System.out.println("This is Oct"); break;
            }
            case 11 :{
                System.out.println("This is Nov"); break;
            }
            case 12:
                System.out.println("This is Dec"); break;
            default:
                System.out.println("Sorry you have entered wrong month");

        }
    }
}
