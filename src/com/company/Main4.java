package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.printf("%-4d", i * j);
            }
            System.out.println();
        }
    }
}
