package com.bridgelabz.TIcTacToeGame;

import java.util.Scanner;

public class TicTacToeGame {

    static char ar[] = new char[10];
    static void create() {
        for (int i = 1; i < ar.length; i++) {
            ar[i] = ' ';
        }
        System.out.println("Task Completed");
    }

    static void read(){
        for(int i=1;i<ar.length;i++) {
            System.out.println("Enter 0 for user entry and 1 for computer");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            if (a == 0) {
                System.out.println("Enter 0 or X");
                char s = scan.next().charAt(0);
                ar[i] = s;
                System.out.println("entered input is : "+ar[i]);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Task Started");
        create();
        read();
    }
}
