package com.company;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 5 || i == 6) {
                continue;
            }
            System.out.printf("%d * %d = %d\n", 7, i, 7 * i);
        }
    }
}
