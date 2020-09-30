import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
//      Quiz activity
//      Store the questions in an array
//      Store the answers in an array
//      use a loop to ask questions and get answers

//      compute the final result (you will probably need another loop)

        Scanner scan = new Scanner(System.in);

        System.out.println("Quiz to determine what your favorite color is.");
        System.out.println("On a scale of 1-10 (1 least, 10 most), how often do you shower.");
//      Camel case, words are separated with capital letters, first word lowercase
        int firstInput = scan.nextInt();

        System.out.println("On a scale of 1-10 (1 least, 10 most), how often do you go on a walk.");
        int secondInput = scan.nextInt();

        if (firstInput > 5) {
            System.out.println("Your favorite color is blue.");
        } else if (secondInput > 5) {
            System.out.println("Your favorite color is green.");
        } else {
            System.out.println("Your favorite color is black.");
        }
    }
}
