package basics;

public class IncDecDemo {

    public static void main(String args[]){
        int num = 10;
        int i = 20;
        System.out.println("The value of num is: "+ num);
        System.out.println(num++);
        System.out.println(num);
        System.out.println(++num);

        System.out.println("=====Decrement=====");
        System.out.println("The value of i is: "+ i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
    }
}
