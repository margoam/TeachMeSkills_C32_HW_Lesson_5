package com.teachmeskills.hw.lesson_5;

/**
 * 1*. Шахматная доска
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * элементам циклам значения B(Black) или W(White). Результат работы
 * программы:
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 */

public class Task1 {

    public static void Task1Runner() {

        String[][] chessArray = new String[8][8];

        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessArray[i][j] = "W";
                } else {
                    chessArray[i][j] = "B";
                }
            }
        }

        System.out.println("Created array is: ");
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                System.out.print((chessArray[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
