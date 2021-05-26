package com.company;

public class Main3 {
    public static void main(String[] args) {

        int i = 0;
        boolean isRun = true;
        while (isRun == true) {
            System.out.println("hello world");
            i++;

            if (i == 1000) {
                isRun = false;
            }

        }

    }
}
