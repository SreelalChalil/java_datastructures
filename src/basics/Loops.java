package basics;

public class Loops {

    public static void main(String args[]) {

        int num = 10;
        int i = 20;

        while (num > 0) {
            System.out.println(num);
            if (num == 5) break;
            num--;
        }
        System.out.println("While loop got executed \n =====================");

        int n = 6;

        for (int j = 1; j <= n; j++) {
            for (int k = n; k >= j; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        System.out.println("====================");

        int c = 9;

        do {
            System.out.println(c);
            c--;
        } while (c > 5);


        boolean isP = false;
        do {
            System.out.println("Do while");
        } while (isP);

        System.out.println("===========");
        for (int f = 0; f < 5; f++) {
            if(f == 3)
                continue;
            System.out.println(f);
        }

    }


}
