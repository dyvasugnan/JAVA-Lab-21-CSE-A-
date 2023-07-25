package javaclass;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] tictactoe = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String row = sc.next();
                tictactoe[i] = row.toCharArray();
            }

            char winner = '.';
            boolean draw = true;

            for (int i = 0; i < 3; i++) {
                if (tictactoe[i][0] == tictactoe[i][1] && tictactoe[i][1] == tictactoe[i][2] && tictactoe[i][0] != '.') {
                    winner = tictactoe[i][0];
                    break;
                }
            }

            if (winner == '.') {
                for (int j = 0; j < 3; j++) {
                    if (tictactoe[0][j] == tictactoe[1][j] && tictactoe[1][j] == tictactoe[2][j] && tictactoe[0][j] != '.') {
                        winner = tictactoe[0][j];
                        break;
                    }
                }
            }

            if (winner == '.') {
                if (tictactoe[0][0] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][2] && tictactoe[0][0] != '.') {
                    winner = tictactoe[0][0];
                } else if (tictactoe[0][2] == tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][0] && tictactoe[0][2] != '.') {
                    winner = tictactoe[0][2];
                }
            }

            if (winner == '.') {
                draw = true;
                for (int i = 0; i < 3; i++) {
                    if (new String(tictactoe[i]).contains(".")) {
                        draw = false;
                        break;
                    }
                }
            }
            if (winner != '.') {
                System.out.println(winner);
            } 
            else{
                System.out.println("DRAW");
            }
        }

        sc.close();
    }
}
