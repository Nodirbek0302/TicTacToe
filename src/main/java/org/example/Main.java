package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "";
        while (true){
            System.out.println("1 - bir kishilik o'ynash uchun 1ni kiriing");
            System.out.println("2 - ikki kishilik o'ynash uchun 2ni kiriing");
             s = scanner.nextLine();
            if (startCheckNum(s)) break;
        }


        switch (s){
            case  "1" -> {
                while (true){
                    TicTacToe.showBoard();
                    while (true){
                        System.out.print("1- ishtiriokchi raqamni kiriting... ");
                        String s1 = scanner.nextLine();
                        if (checkInputNumber(s1)){
                            TicTacToe.startGame(Integer.parseInt(s1),true);
                             break;
                        }
                    }

                    TicTacToe.startGame(new Random().nextInt(1,9),false);
                }
            }
            case  "2" -> {
                while (true){
                    TicTacToe.showBoard();
                    while (true){
                        System.out.print("1- ishtiriokchi raqamni kiriting... ");
                        String s1 = scanner.nextLine();
                        if (checkInputNumber(s1)) {
                            TicTacToe.startGame(Integer.parseInt(s1),true);
                            break;
                        }
                    }

                   while (true){
                       System.out.print("2- ishtiriokchi raqamni kiriting... ");
                       String s2 = scanner.nextLine();
                       if (checkInputNumber(s2)) {
                           TicTacToe.startGame(Integer.parseInt(s2),false);
                           break;
                       }
                   }

                }
            }
        }

    }

    public static boolean checkInputNumber(String string){
        if (string.matches("^[1-9]$")){
            return true;
        }

        System.out.println("notug'ri qiymat kiritildi ");
        return false;
    }

    public static boolean startCheckNum(String s){
        if (s.matches("^[1-2]$")){
            return true;
        }
        System.out.println("notug'ri qiymat kiritildi ");
        return false;
    }
}