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

        printBoard(board);
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
}
