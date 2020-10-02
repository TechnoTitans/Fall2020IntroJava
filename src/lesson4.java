public class lesson4 {
    public static void main (String[] args) {
//      Multidimensional
//      Row X Col
        int[][] twoD = new int[3][4];
//      Where x is an integer
//      [[x, x, x, x],
//       [x, x, x, x],
//       [x, x, x, x]]

//      int[][][] threeD = new int[3][4][3];

//      4x3
        int[][] twoDInit = {{1, 3, 5}, {4, 3, 5}, {1, 4, 5}, {4, 3, 5}};

        for (int i = 0; i < twoDInit.length; i++) {
            for (int j = 0; j < twoDInit[i].length; j++) {
                System.out.println(twoDInit[i][j]);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
