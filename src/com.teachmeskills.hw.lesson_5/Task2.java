package com.teachmeskills.hw.lesson_5;

/**
 * 2*. Умножение двух матриц
 * Создайте два массива целых чисел (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class Task2 {

    public static void Task2Runner() {

        int[][] firstArrayToMultiply = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondArrayToMultiply = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] resultOfMultiplication = new int[3][3];

        for (int i = 0; i < firstArrayToMultiply.length; i++) {
            for (int j = 0; j < secondArrayToMultiply[0].length; j++) {
                for (int k = 0; k < secondArrayToMultiply.length; k++) {
                    resultOfMultiplication[i][j] += firstArrayToMultiply[i][k] * secondArrayToMultiply[k][j];
                }
            }
        }

        System.out.print("The result of multiplication: ");
        for (int i = 0; i < resultOfMultiplication.length; i++) {
            for (int j = 0; j < resultOfMultiplication[i].length; j++) {
                System.out.print((resultOfMultiplication[i][j]) + " ");
            }
        }
    }
}
