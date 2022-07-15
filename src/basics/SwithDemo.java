package basics;

import java.util.Scanner;

public class SwithDemo {

    public static void main(String args[]){
        int num;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        switch (num){
            case 0 :
                System.out.println("The number is zero");
                break;
            case 10 :
                System.out.println("The number is Ten");
                break;
            default:
                System.out.println("The number is not zero or 10");
        }


    }
}
