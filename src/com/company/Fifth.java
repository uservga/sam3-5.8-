package com.company;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число #1: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число #2: ");
        int b = scanner.nextInt();
        System.out.print("Введіть число #3: ");
        int c = scanner.nextInt();
        if(a > b & a > c & b > c){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }else if(a > b & a > c & c > b){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }else if(b > a & b > c & a > c){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }else if(b > a & b > c & c > a){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }else if(c > a & c > b & a > b){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }else if(c > a & c > b & b > a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
