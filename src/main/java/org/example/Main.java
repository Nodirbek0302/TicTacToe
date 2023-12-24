package org.example;

import java.util.Random;
import java.util.Scanner;

import static org.example.TicTacToe.gameBoard;
import static org.example.TicTacToe.message;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "";
        while (true) {
            System.out.println("1 - bir kishilik o'ynash uchun 1ni kiriing");
            System.out.println("2 - ikki kishilik o'ynash uchun 2ni kiriing");
            System.out.println("0 - uyinni tugatish uchun 0ni kiriting");

            s = scanner.nextLine();
            if (startCheckNum(s)) break;
        }


        switch (s) {
            case "1" -> {
                while (true) {
                    TicTacToe.showBoard();
                    while (true) {
                        System.out.print("1- ishtiriokchi raqamni kiriting... ");
                        String s1 = scanner.nextLine();
                        if (checkInputNumber(s1)) {
                            if (!check(Integer.valueOf(s1)))
                                continue;

                            TicTacToe.startGame(Integer.parseInt(s1), true);
                            break;
                        }
                    }

                    TicTacToe.startGame(new Random().nextInt(1, 9), false);
                }
            }
            case "2" -> {
                while (true) {
                    TicTacToe.showBoard();
                    while (true) {
                        System.out.print("1- ishtiriokchi raqamni kiriting... ");
                        String s1 = scanner.nextLine();
                        if (checkInputNumber(s1)) {
                            if (!check(Integer.valueOf(s1)))
                                continue;
                            TicTacToe.startGame(Integer.parseInt(s1), true);
                            break;
                        }
                    }

                    while (true) {
                        System.out.print("2- ishtiriokchi raqamni kiriting... ");
                        String s2 = scanner.nextLine();
                        if (checkInputNumber(s2)) {
                            if (!check(Integer.valueOf(s2)))
                                continue;
                            TicTacToe.startGame(Integer.parseInt(s2), false);
                            break;
                        }
                    }

                }
            }
        }

    }

    public static boolean checkInputNumber(String string) {
        if (Integer.parseInt(string)==0){
            System.out.println("O'yin tugatildi");
            System.exit(0);
        }
        if (string.matches("^[1-9]$")) {
            return true;
        }

        System.out.println("notug'ri qiymat kiritildi ");
        return false;
    }

    public static boolean startCheckNum(String s) {
        if (s.matches("^[1-2]$")) {
            return true;
        }
        System.out.println("notug'ri qiymat kiritildi ");
        return false;
    }

    public static boolean check(Integer s) {
        switch (s) {
            case 1 -> {
                if (gameBoard[0][0] != ' ') {
                    message();
                    return false;
                }
                return true;

            }
            case 2 -> {
                if (gameBoard[0][2] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 3 -> {
                if (gameBoard[0][4] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 4 -> {
                if (gameBoard[2][0] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 5 -> {
                if (gameBoard[2][2] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 6 -> {
                if (gameBoard[2][4] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 7 -> {
                if (gameBoard[4][0] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 8 -> {
                if (gameBoard[4][2] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            case 9 -> {
                if (gameBoard[4][4] != ' ') {
                    message();
                    return false;
                }
                return true;
            }
            default -> System.out.println("Iltimos faqatgina 1-9 oraliqdagi raqamni kirting");
        }
        return false;
    }
}