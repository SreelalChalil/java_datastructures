package primitives;

public class BitOperations {
    public static void main(String[] args) {
        short n = countBits(785);
        System.out.println(n);
        System.out.println( n & 1);
        int x = 13;
        System.out.println(x>>>=1);
    }

    public static short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits; }
}
