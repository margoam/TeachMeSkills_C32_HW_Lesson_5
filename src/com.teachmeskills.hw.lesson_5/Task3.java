package com.teachmeskills.hw.lesson_5;

import java.util.Scanner;

/**
 * 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */

public class Task3 {

    public static void Task3Runner() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a length of an array: ");
        System.out.println("x: ");
        int userInputX = input.nextInt();
        System.out.println("y: ");
        int userInputY = input.nextInt();

        int[][] twoDimensionalArray = new int[userInputX][userInputY];
        int summOfArray = 0;

        System.out.println("Created array: ");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = (int) (Math.random() * 10);
                System.out.print((twoDimensionalArray[i][j]) + " ");
                summOfArray += twoDimensionalArray[i][j];
            }
            System.out.println();
        }

        System.out.println("The array sum is: " + summOfArray);
    }
}
