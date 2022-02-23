package com.company;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("На якому поверсі ви знаходетесь(1-9): ");
        int a = scanner.nextInt();
        if (a > 1 & a < 9){
            Scanner scan = new Scanner(System.in);
            System.out.print("Куди їдем?(до верху/до низу): ");
            String b = scan.nextLine();
            if(b.equals("до верху")){
                Scanner scan1 = new Scanner(System.in);
                System.out.print("Виберіть поверх від "+a+" до 9: ");
                int b1 = scan1.nextInt();
                if(b1==2){
                    System.out.print("Ви піднялися на 3 поверх!");
                }else {
                    System.out.print("Ви піднялися на " + b1 + " поверх!");
                }
            }else if(b.equals("до низу")){
                Scanner scan2 = new Scanner(System.in);
                System.out.print("Виберіть поверх від "+a+" до 1: ");
                int b2 = scan2.nextInt();
                if(b2==2){
                    System.out.print("Ви спустилися на 1 поверх!");
                }else {
                    System.out.print("Ви спустилися на "+b2+" поверх!");
                }
            }
        }else if (a==1){
            System.out.println("Їдем до гори!");
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Виберіть поверх(2-9): ");
            int a1 = scanner1.nextInt();
            if(a1==2){
                System.out.print("Ви піднялися на 3 поверх!");
            }else {
                System.out.print("Ви піднялися на " + a1 + " поверх!");
            }
        }else if (a==9){
            System.out.println("Їдем до низу!");
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Виберіть поверх(8-1): ");
            int a2 = scanner2.nextInt();
            if(a2==2){
                System.out.print("Ви спустилися на 1 поверх!");
            }else {
                System.out.print("Ви спустилися на "+a2+" поверх!");
            }
        }
    }
}
