import java.util.Scanner;

public class connectFour {
    public static void main (String[] args) {
//         | |
//        -+-+-
//        O| |
//        -+-+-
//         | |X

//        6x7 matrix (6 rows, 7 cols)

//        +-------------+
//        | | | | | | | |
//        +-+-+-+-+-+-+-+
//        | | | | | | | |
//        +-+-+-+-+-+-+-+
//        | | | | | | | |
//        +-+-+-+-+-+-+-+
//        | | | | | | | |
//        +-+-+-+-+-+-+-+
//        | | | | | | | |
//        +-+-+-+-+-+-+-+
//        | | | | | | | |
//        +-------------+

//      Requirements
//        - 2 Players
//        - Invalid input checks

//      Elements of the game
//        - Showing the turns
//        - Placing pieces
//        - Checking win/loose
//        - Game over

//      Technical details
//        - 2d Array to store game state
//        - while loop

        String[][] board = {
                {" ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " "}
        };
        Scanner scan = new Scanner(System.in);

        int col;
        int row;
        String currentPlayer = "X";


        while (true) {
            System.out.println("Player " + currentPlayer + "'s turn!");
            printBoard(board);

            col = scan.nextInt();
            row = getRow(board, col);
            board[row][col] = currentPlayer;

            if (checkWin(board, row, col, currentPlayer)) {
                break;
            }

            if (currentPlayer == "X") {
                currentPlayer = "O";
            } else {
                currentPlayer = "X";
            }
        }

        System.out.println("Good Game!");
    }

    private static int getRow (String[][] board, int col) {
        for (int row = board.length-1; row >= 0; row--) {
            if (board[row][col] == " ") {
                return row;
            }
        }
        return 0;
    }

    private static void printBoard (String[][] board) {
        System.out.println("+-------------+");
        for (int i = 0; i < board.length; i++) {
            if (i != 0) {
                System.out.println("+-+-+-+-+-+-+-+");
            }
            System.out.println("|" + board[i][0] + "|" + board[i][1] + "|" + board[i][2] + "|"
                    + board[i][3] + "|" + board[i][4] + "|" + board[i][5] + "|" + board[i][6] + "|");
        }
        System.out.println("+-------------+");
    }

    private static boolean checkWin(String[][] board, int row, int col, String currentPlayer) {
//      Check row victory
        int counter = 0;

        for (int loop_col = 0; loop_col < board[row].length; loop_col++) {
            if (board[row][loop_col] == currentPlayer) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter >= 4) {
                return true;
            }
        }

        return false;
    }
}
