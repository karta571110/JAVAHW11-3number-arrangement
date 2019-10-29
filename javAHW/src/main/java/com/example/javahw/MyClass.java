package com.example.javahw;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            double r;
            for (int i = 0; i < 2; i++) {
                if (x < y) {
                    r = x;
                    x = y;
                    y = r;
                }
                if (y < z) {
                    r = y;
                    y = z;
                    z = r;
                }


            }
            System.out.println(x+","+y+","+z);
        }
    }
}
