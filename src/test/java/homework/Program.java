package homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args){

        System.out.println("");
        System.out.println("                    Домашняя работа 1. Задание 1");
        System.out.println("");
       int a1 = 1;
       int a2 = 0;
       byte b1 = 2;
       byte b2 = 3;
       short c1 = 5;
       short c2 = 5;
       long d1 = 10;
       long d2 = 11;
       float f1 = 56.3f;
       float f2 = 56.29f;
       double g1 = 67.1;
       double g2 = 67.099;
       boolean h1 = true;
       boolean h2 = false;
       char t1 = 0;
       char t2 = 1;
       if(a1<a2){
           System.out.println("значение 1 меньше значения 2");
       }else if (a1==a2){
           System.out.println("оба значения равны");
       }else {
           System.out.println("значение 1 больше значения 2");
       }

        if(b1<b2){
            System.out.println("значение 1 меньше значения 2");
        }else if (b1==b2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значение 1 больше значения 2");
        }

        if(c1<c2){
            System.out.println("значение 1 меньше значения 2");
        }else if (c1==c2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значение 1 больше значения 2");
        }

        if(d1<d2){
            System.out.println("значение 1 меньше значения 2");
        }else if (d1==d2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значение 1 больше значения 2");
        }

        if(f1<f2){
            System.out.println("значение 1 меньше значения 2");
        }else if (f1==f2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значение 1 больше значения 2");
        }

        if(g1<g2){
            System.out.println("значение 1 меньше значения 2");
        }else if (g1==g2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значение 1 больше значения 2");
        }

        if(h1==h2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значения не равны");
        }
        if(t1<t2){
            System.out.println("значение 1 меньше значения 2");
        }else if (t1==t2){
            System.out.println("оба значения равны");
        }else {
            System.out.println("значение 1 больше значения 2");
        }

        System.out.println(" ");
        System.out.println("                    Домашняя работа 1. Задание 2");

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        switch (dayOfWeek) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Сегодня выходной");
                break;
            case FRIDAY:
                System.out.println("Завтра выходной");
                break;
            default:
                System.out.println("Сегодня рабочий день");
                break;

        }
    }


}
