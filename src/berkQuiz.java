import java.util.Scanner;

public class berkQuiz {
    public static void main (String[] args){
//      Quiz to determine your favorite genre of music
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi this is a quiz to determine what your favorite genre of music is!");
        System.out.println("Please respond to all questions with a number [1, 10]");
        System.out.println("1 being not at all, 10 being all the time/very much so");

        String[] questions = {"Are you angry?", "Do you play an instrument?", "Are you happy?",
                "Are you in robotics?", "Do you have good headphones?"};
        double[] proRock = {0, 1.5, 0, 0, 1};
        double[] proHipHop = {1, 0, 0, 2, 0};
        double rockScore = 0;
        double hipHopScore = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int answer = scan.nextInt();
            rockScore += proRock[i] * answer;
            hipHopScore += proHipHop[i] * answer;
        }

        if (rockScore > hipHopScore) {
            System.out.println("Your favorite genre of music is rock.");
        } else if (rockScore < hipHopScore) {
            System.out.println("Your favorite genre of music is hip hop.");
        } else {
            System.out.println("You don't have a favorite genre of music.");
        }
    }
}
