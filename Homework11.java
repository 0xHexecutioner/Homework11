package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Input site a:");
        a = sc.nextInt();
        System.out.println("Input site b:");
        b = sc.nextInt();

        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= b; i++) {
                if (j == 1 || j == a || i == 1 || i == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
