package ru.vsu.sc.berezin_y_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.println("Доброго времени суток! Данная программа поможет Вам посчитать, какую сумму вы получите по истечению срока вклада, но для начала необходимо ввесит входные данные.");
        System.out.print("Введите сумму вклада (руб.): ");
        double m = readNum();

        System.out.print("Введите процентную ставку (вещественное число, %): ");
        double k = readNum();

        System.out.print("Введите срок вклада (месяцев): ");
        double n = readNum();

        double s = m * Math.pow((1 + k/100), n);

        int int_n = (int) n;
        System.out.printf("По истечению срока вклада (за %d месяцев) Вы получите %2.00f руб.", int_n, s);
    }

    public static double readNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
