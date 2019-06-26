package com.company;

import java.util.Scanner;

public class Main {
    static String[] people = {"Esentur", "Askar", "Beknur"};
    static int selectedNumber;

    public static void main(String[] args) {
        System.out.println("Основное задание.");
        System.out.println("У нас есть "+people.length+ " человека");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i] + " под индексом " + i);
        }
        wishes();
        /*System.out.println("Задание на сообразительность");
        String[] people = new String[4];
        String[] people = {"Esentur", "Askar", "Beknur", "Andrey"};
        wishes();*/
    }

    public static void wishes() {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите индекс человека, которому хотите пожелать доброго времени суток.");
        selectedNumber = in.nextInt();
        in.close();
        switch (selectedNumber) {
            case 0:
                System.out.println(people[0] + "! Доброе утро!");
                break;
            case 1:
                System.out.println(people[1] + "! Добрый день!");
                break;
            case 2:
                System.out.println(people[2] + "! Добрый вечер!");
                break;
            case 3:
                if (people.length < 4) {
                    System.out.println("Вы не можете выбрать это число");
                } else {
                    System.out.println(people[3] + "! Доброй ночи!");
                }
                break;
            default:
                System.out.println("Нету человека под таким индексом");
        }
    }
}
