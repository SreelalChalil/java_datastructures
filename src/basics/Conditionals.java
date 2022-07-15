package basics;

public class Conditionals {


    public static void main(String args[]){
        int num1 = 20;
        int num2 = 10;

        if(num1<num2){
            System.out.println("Number 1 is smaller than Number 2");
        }
        else if(num1<5){
            System.out.println("Number 1 is greater than 5");
        }
        else if(num1>0){
            System.out.println("Number 1 is greater than 0");
        }
        else{
            System.out.println("Number 1 is greater than Number 2");
        }

    System.out.println("===================");

        switch (num1){
            case 10:
                System.out.println("Number is 10");
                break;
            case 20 :
                System.out.println("Number is 20");
        }

        String name = "Arun";

        switch (name){
            case "Amritha":
                System.out.println("Name is Amritha");
                break;
            case "Arun":
                System.out.println("Name is Arun");
                break;
            default:
                System.out.println("No match found");
        }
        System.out.println("outside switch");
    }

}
