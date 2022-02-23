package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число від 0 до 28800 сек: ");
        int sec = scanner.nextInt();
        if (sec < 3600){
            System.out.println("До кінця робочого дня залишилось менше 1 години");
        }else{
            int hours = sec/3600;
            int minutes = (sec-(hours*3600))/60;
            int secund = sec-(hours*3600)-(minutes*60);
            System.out.println("До кінця робочого дня залишилось "+hours+" годин "+minutes+" хвилин "+secund+" секунд");
        }
    }
}
