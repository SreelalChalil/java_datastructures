package algorithms.series;

public class Fibonacci {
    public static void main(String[] args){
        int n = 10;
        int i =0;
        while (i<n){
            System.out.println(fib(i));
            i++;
        }
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static int fib(int i){
        if(i == 0) return 0;
        if(i == 1 || i== 2 ) return  1;
        else return fib(i-2)+fib(i-1);
    }
}
// when i = 3, return fib(3-2) + fib (3 -1) => fib(1) + fib(2) => 1+1 => 2
// when i = 4, return fib(4-2) + fib (4-1) => fib(2) + fib(3) => (1) + [fib(3-2) + fib (3 -1)] => 1 + 1 + 1 => 3