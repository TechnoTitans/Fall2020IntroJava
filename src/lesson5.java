public class lesson5 {
    public static void main (String[] args) {
//      Diamond
//        *
//       ***
//      *****
//       ***
//        *
        System.out.println("Diamond:");
        for (int i = 0; i < 10; i++) {
//          10 = spaces + asterisks
//          9 - i = spaces
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 8; i >= 0; i--) {
//          10 = spaces + asterisks
//          9 - i = spaces
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

//      Isosceles
//        *
//       ***
//      *****
        System.out.println("Isosceles Triangle:");
        for (int i = 0; i < 10; i++) {
//          10 = spaces + asterisks
//          9 - i = spaces
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("Triangle flipped across x=0 and y=0:");
        for (int i = 9; i >= 0; i--) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Triangle flipped across x=0:");
        for (int i = 0; i < 10; i++) {
//          10 = spaces + asterisks
//          9 - i = spaces
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Triangle flipped across y=0:");
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Triangle:");
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
//                System.out.print("(" + i + ", " + j + ")");
            }
            System.out.println();
        }

        System.out.println("Square:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
