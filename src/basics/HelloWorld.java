package basics;


class HelloWorld {

    public static void main(String args[]){

        int num1 = 5; //statement 1
        int num2 = 10; // statement 2
        int sum = num1 + num2;
        System.out.println("The Sum is " + sum);

        float num3 = 6.8F;
        float num4 = 7.9F;

        float result1 = num3 * num4;
        System.out.println(result1);

        String s1 = "Hello World";
        System.out.println(s1);

        boolean isGreaterThan = 7>6;
        System.out.println(isGreaterThan);
        int n1 = 5;
        int n2 = 7;
        boolean notEquals = n1!=n2;
        System.out.println(notEquals);
        System.out.println(n1==n2);
        System.out.println(n1);

    }

}
