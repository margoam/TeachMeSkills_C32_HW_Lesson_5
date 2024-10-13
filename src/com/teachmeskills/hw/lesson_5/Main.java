package com.teachmeskills.hw.lesson_5;

import java.util.Scanner;

/**
 * For running tasks
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a task name to launch: Task0, Task1, Task2, Task3");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        switch (userChoice) {
            case ("Task0"): {
                System.out.println("Task number 0 is launched.");
                Task0.Task0Runner();
                break;
            }
            case ("Task1"): {
                System.out.println("Task number 1 is launched.");
                Task1.Task1Runner();
                break;
            }
            case ("Task2"): {
                System.out.println("Task number 2 is launched.");
                Task2.Task2Runner();
                break;
            }
            case ("Task3"): {
                System.out.println("Task number 3 is launched.");
                Task3.Task3Runner();
                break;
            }
            default: {
                System.out.println("Incorrect task is selected. Please, try again.");
            }
        }
    }
}
