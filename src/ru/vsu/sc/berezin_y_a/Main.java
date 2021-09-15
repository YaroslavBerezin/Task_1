package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        double depositAmount = readNum("Enter the deposit amount ($): ");
        checkNum(depositAmount);

        double interestRate = readNum("Enter the interest rate (%): ");
        checkNum(interestRate);

        double depositTerm = readNum("Enter the deposit term (months): ");
        checkNum(depositTerm);

        double depositSum = logic(depositAmount, interestRate, depositTerm);

        printAnswer(depositAmount, depositSum);

    }

    static void printAnswer(double N, double S) {
        System.out.printf("At the end of the deposit period (in %d months) You will have $%2.00f", (int) N, S);
    }

    static double readNum(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void checkNum(double num) {
        if (num < 0) {
            System.out.println("Error");
            System.exit(0);
        }
    }

    static double logic(double M, double K, double N) {
        return (M * Math.pow((1 + K / 100), N));
    }

}