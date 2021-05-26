package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPersons = 10;
        int sum = 0;
        int currentMoney = 0;
        boolean isRun = true;

        for (int i = 0; i < countPersons && isRun == true; i++) {
            System.out.print("Input current money: ");
            currentMoney = input.nextInt();

            sum += currentMoney;

            if (sum >= 200) {
                isRun = false;
            }
        }

        /*for (int i = 0; i < countPersons; i++) {
            System.out.print("Input current money: ");
            currentMoney = input.nextInt();

            sum += currentMoney;

            if (sum >= 200) {
                break;
            }
        }*/
        System.out.print("Sum money: " + sum);

    }
}
