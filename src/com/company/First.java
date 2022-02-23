package com.company;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int a = scanner.nextInt();
        if (25 < a & a < 100){
            System.out.println("Число " + a + " міститься в проміжку (25; 100)");
        }else{
            System.out.println("Число " + a + " не міститься в проміжку (25; 100)");
        }
    }
}
