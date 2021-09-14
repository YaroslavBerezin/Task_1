// V1.05

package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        findSumOfDeposit();

    }

    public static void findSumOfDeposit() {

        Locale.setDefault(Locale.ROOT);

        System.out.print("Enter the deposit amount ($): ");
        double m = readNum();

        System.out.print("Enter the interest rate (%): ");
        double k = readNum();

        System.out.print("Enter the deposit term (months): ");
        double n = readNum();

        double s = m * Math.pow((1 + k / 100), n);

        System.out.printf("At the end of the deposit period (in %d months) You will have $%2.00f", (int) n, s);

    }

    public static double readNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
