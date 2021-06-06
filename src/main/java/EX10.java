/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */


import java.util.Scanner;

public class EX10 {
    static final double tax = .055;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of item 1");
        int p1 = input.nextInt();

        System.out.println("Enter the quantity of item 1");
        int q1 = input.nextInt();

        System.out.println("Enter the price of item 2");
        int p2 = input.nextInt();

        System.out.println("Enter the quantity of item 2");
        int q2 = input.nextInt();

        System.out.println("Enter the price of item 3");
        int p3 = input.nextInt();

        System.out.println("Enter the quantity of item 3");
        int q3 = input.nextInt();

        double total = ((p1*q1)+(p2*q2)+(p3*q3));
        double fin = total*tax;

        System.out.println("Subtotal: $"+total+"");
        System.out.println("Tax: $"+fin);
        System.out.println("Total: $"+(total+fin));

    }
    }
