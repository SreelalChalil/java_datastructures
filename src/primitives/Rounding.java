package primitives;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Rounding {
    public static void main(String[] args) {
        double f = 568.8956F;
        char[] charArray = new char[3];
        Arrays.fill(charArray,'0');
        String noOfZeros = new String(charArray);
        //DecimalFormat
        DecimalFormat formatter = new DecimalFormat("#,##0."+noOfZeros);
        formatter.setRoundingMode(RoundingMode.DOWN);
        System.out.println(formatter.format(f));
    }
}

