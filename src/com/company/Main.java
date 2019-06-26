package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Основное задание

        Scanner in = new Scanner(System.in);
            String[] people = {"Esentur", "Askar", "Beknur"};
            System.out.println("У нас есть " + people.length + " человека");
            for (int i = 0; i < people.length; i++) {
                System.out.println(people[i] + " под индексом " + i);
            }
            System.out.println("Выберите индекс человека, которому хотите пожелать доброго времени суток.");
            int selectedNumber = in.nextInt();
            wishes(people, selectedNumber);
        //Задание на сообразительность

            String[] people1 = Arrays.copyOf(people, 4); //переопределение массива типа String осуш-ся
            people1[3] = "Andrey";                                  //путем копирования ее содрежимого + увел. размера
            System.out.println("У нас есть " + people1.length + " человека");
            for (int i = 0; i < people1.length; i++) {
                System.out.println(people1[i] + " под индексом " + i);
            }
            System.out.println("Выберите индекс человека, которому хотите пожелать доброго времени суток.");
            int selectedNumber1 = in.nextInt();
            wishes(people1, selectedNumber1);
        in.close();
    }

    public static void wishes(String[] arr, int num) {

        switch (num) {
            case 0:
                System.out.println(arr[0] + "! Доброе утро!");
                break;
            case 1:
                System.out.println(arr[1] + "! Добрый день!");
                break;
            case 2:
                System.out.println(arr[2] + "! Добрый вечер!");
                break;
            case 3:
                if (arr.length < 4) {
                    System.out.println("Вы не можете выбрать это число");
                } else {
                    System.out.println(arr[3] + "! Доброй ночи!");
                }
                break;
            default:
                System.out.println("Нету человека под таким индексом");
                break;
        }

    }
}

