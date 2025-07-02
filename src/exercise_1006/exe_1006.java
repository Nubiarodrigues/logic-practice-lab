package exercise_1006;

import java.util.Locale;
import java.util.Scanner;

public class exe_1006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double calculate = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f\n", calculate);

        sc.close();
    }
}
