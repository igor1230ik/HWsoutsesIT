package HW4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pi {
    public static void main(String[] args) {

        BigDecimal pi = new BigDecimal(Math.PI);
        double pi_1 = Math.PI;
        int x = 0;
        System.out.println(pi);
        for (int i = 0; i < 5; i++) {
            x = 1 + x;
            System.out.print(String.format("%.5f", pi_1) + "  "); // пробный вывод значения типа double
            System.out.println(pi.setScale((i + 1), RoundingMode.HALF_UP));

        }
    }
}
