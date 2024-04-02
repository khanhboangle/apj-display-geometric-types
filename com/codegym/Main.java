package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");

        int option;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Select the geometry you want to display: ");
            option = input.nextInt();
        } while (option != 1 && option != 2 && option != 3 && option != 4);

        if (option == 1) {
            int chieuDai;
            int chieuRong;
            System.out.println("Enter length: ");
            chieuDai = input.nextInt();
            System.out.println("Enter width");
            chieuRong = input.nextInt();

            System.out.println("Print the rectangle:");
            for (int i = 1; i <= chieuRong; i++) {
                for (int j = 1; j <= chieuDai; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (option == 2) {
            int canhGocVuong;
            System.out.println("Enter the side length of the right triangle: ");
            canhGocVuong = input.nextInt();

            System.out.println("Print the square triangle:");
            System.out.println("- Top-left:");
            for (int i = canhGocVuong; i >= 1; i--) {
                for (int j = 1; j <= i; j++)
                    System.out.print("* ");
                System.out.println();
            }
            System.out.println("- Top-right:");
            for (int i = canhGocVuong; i >= 1; i--) {
                for (int k = canhGocVuong; k > i; k--)
                    System.out.print("  ");
                for (int j = 1; j <= i; j++)
                    System.out.print("* ");
                System.out.println();
            }
            System.out.println("- Bottom-left:");
            for (int i = 1; i <= canhGocVuong; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print("* ");
                System.out.println();
            }
            System.out.println("- Bottom-right");
            for (int i = 1; i <= canhGocVuong; i++) {
                for (int k = canhGocVuong; k > i; k--)
                    System.out.print("  ");
                for (int j = 1; j <= i; j++)
                    System.out.print("* ");
                System.out.println();
            }
        } else if (option == 3) {
            int duongCao;
            System.out.println("Enter the length of the altitude of the isosceles triangle:");
            duongCao = input.nextInt();
            System.out.println("Print isosceles triangle:");
            for (int i = 1; i <= duongCao; i++) {
                for (int k = duongCao; k > i; k--)
                    System.out.print("  ");
                for (int j = i * 2; j > 1; j--)
                    System.out.print("* ");
                System.out.println();
            }
        } else if (option == 4)
            System.out.println("Exit");
    }
}