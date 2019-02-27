package com.company;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        double a;
        int b;
        Scanner in = new
                Scanner(System.in);
        System.out.print("Введите число - ");
        a = in.nextDouble();
        System.out.print("Выберите функцию:  " +
                "1 - найти корень числа; " +
                "2 - возвести число в степень: ");
        b = in.nextInt();
        switch (b) {
            case 1:
               double c = Math.sqrt(a);
               System.out.println("Корень из числа " + a + " = " + c);
               break;
           case 2:
               System.out.print("В какую степень возвести число: ");
               int s = in.nextInt();
               double n = Math.pow(a, s);
               System.out.println("Число " + a + " в " + s + " степени = " + n);
               break;
           default:
               System.out.println("Ошибка!");
               break;


       }

   }
}
