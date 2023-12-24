package org.example;

public class TicTacToe {
   public static char [] [] gameBoard = {
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}
    };

   public static void startGame(int number, boolean player){
       char symbl = 'O';
       if (player) symbl = 'X';


       switch (number){
           case 1 -> {
               if (gameBoard[0][0]!=' '){
                   message();
                   return;
               }
               gameBoard[0][0] = symbl;

           }
           case 2 -> {
               if (gameBoard[0][2]!=' ') {
                   message();
                   return;
               }
               gameBoard[0][2] = symbl;
           }
           case 3 -> {
               if (gameBoard[0][4]!=' ') {
                   message();
                   return;
               }
               gameBoard[0][4] = symbl;
           }
           case 4 -> {
               if (gameBoard[2][0]!=' ') {
                   message();
                   return;
               }
               gameBoard[2][0] = symbl;
           }
           case 5 -> {
               if (gameBoard[2][2]!=' ') {
                   message();
                   return;
               }
               gameBoard[2][2] = symbl;
           }
           case 6 -> {
               if (gameBoard[2][4]!=' ') {
                   message();
                   return;
               }
               gameBoard[2][4] = symbl;
           }
           case 7 -> {
               if (gameBoard[4][0]!=' ') {
                   message();
                   return;
               }
               gameBoard[4][0] = symbl;
           }
           case 8 -> {
               if (gameBoard[4][2]!=' ') {
                   message();
                   return;
               }
               gameBoard[4][2] = symbl;
           }
           case 9 -> {
               if (gameBoard[4][4]!=' ') {
                   message();
                   return;
               }
               gameBoard[4][4] = symbl;
           }
           default -> System.out.println("Iltimos faqatgina 1-9 oraliqdagi raqamni kirting");
       }

       char c = checkWinner();
       if (c !=' ') {
           showBoard();
           System.out.println("Winner = " + c);
           System.exit(0);
       }

       showBoard();

   }

    public static void showBoard() {
        System.out.println("<===============================>");
        for (char[] chars : gameBoard) {
            System.out.println(chars);
        }
    }

    public static char checkWinner() {
        for (int i = 0; i < 6; i+=2) {
            if (gameBoard[i][0] == gameBoard[i][2] && gameBoard[i][2] == gameBoard[i][4]) {
                return gameBoard[i][0];
            }
            if (gameBoard[0][i] == gameBoard[2][i] && gameBoard[2][i] == gameBoard[4][i]) {
                return gameBoard[0][i];
            }
        }

        if (gameBoard[0][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][4]) {
            return gameBoard[0][0];
        }
        if (gameBoard[0][4] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][0]) {
            return gameBoard[0][4];
        }

        // O'yin davom etmoqda
        return ' ';
    }

    static void message() {
        System.out.println("bu joy tanlangan");
    }
}
