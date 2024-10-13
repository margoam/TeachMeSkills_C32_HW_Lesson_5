package com.teachmeskills.hw.lesson_5;

import java.util.Scanner;

/**
 * 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */

public class Task0 {

    public static void Task0Runner() {

        int[][][] threeDimensionalArray = {
                {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}},
                {{9, 10, 11}, {12, 13, 14}, {15, 16, 17}},
                {{18, 19, 20}, {21, 22, 23}, {24, 25, 26}}
        };

        System.out.println("Please, enter a number for three dimensional array changing: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        //To increase elements in the array with entered by a user increment
        System.out.println("New array with users' increment: ");
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print((threeDimensionalArray[i][j][k] += userInput) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
