import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args);

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a noun: ");
        String noun = scan.nextLine();

        System.out.print("Input a adjective: ");
        String adj = scan.nextLine();

        System.out.println(noun);
        System.out.println(adj);
    }
}
