package com.company;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scanner.nextInt();

        int b = a/100;
        int c = a%100/10;
        int d = a%10;
        int maxmin = Math.max(b,c);
        int maxmax = Math.max(maxmin,d);
        System.out.println("Найбільша цифра числа = " + maxmax);
    }
}
