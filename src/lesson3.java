public class lesson3 {
    public static void main (String[] args) {
//      Kids are going to lunch! The 5 kids in my class start with a hunger between [6, 14], and
//      every 10 min of lunch, their hunger decreases by 1. Lunch length is determined by a var.
//      Print a report of kids who are still hungry (hunger of 10+)
        int standardLunchTimeMin = 30;
        int[] kidHunger = {7, 10, 14, 6, 9};

        for (int timeLeft = standardLunchTimeMin; timeLeft >= 10; timeLeft -= 10) {
            for (int i = 0; i < kidHunger.length; i++) {
                kidHunger[i] -= 1;
            }
        }

        for (int shoeSize : kidHunger) {
            System.out.print(shoeSize + ", ");
        }

        System.out.println();

        for (int i = 0; i < kidHunger.length; i++) {
            if (kidHunger[i] >= 10) {
                System.out.println("Kid at index " + i + " is still hungry :(");
            }
        }

        System.out.println("\n\n================\n");

//      Loops:
        int[] classShoeSizes = {10, 11, 6, 14};

//      for each loop
//        don't know what index im currently at, so can't change values within array
        for (int shoeSize : classShoeSizes) {
            System.out.println(shoeSize);
        }

//      for loop
//        when you know how many times you want to run the loop
//        in a regular for loop, you don't have to loop through an array
//        and you can change the values in the array
        for (int i = 0; i < classShoeSizes.length; i++) {
            classShoeSizes[i] += 1;
            System.out.print(classShoeSizes[i] + ", ");
        }

        System.out.println();

        for (int shoeSize : classShoeSizes) {
            System.out.print(shoeSize + ", ");
        }

//        for (int i = 10; i < 1000; i += 10) {
//            System.out.print(i);
//        }

        System.out.println();

//      while loop
//        scenarios where you don't know how many times the loop will iterate
        int x = 0;

        while (x < classShoeSizes.length) {
            System.out.print(classShoeSizes[x] + ", ");
            x++;
        }

        System.out.println();

//      Arrays:
        String[] classNames = {"Joe", "Martha", "Hannah", "Blake"};

        System.out.println(classNames[0] + " " + classNames[1] + " " + classNames[2] + " " + classNames[3]);

        classNames[1] = "Abby";

        System.out.println(classNames[0] + " " + classNames[1] + " " + classNames[2] + " " + classNames[3]);

//      Initializer lists
        int[] class2Heights = {201, 160, 190, 183};

        System.out.println(class2Heights[0] + " " + class2Heights[1] + " " + class2Heights[2] + " " + class2Heights[3]);

//       0  1  2  3  4
//      [4, 5, 6, 3, 4]

//      arrays are ordered lists and you access specific indexes
//      Declare array var    initializing it to a value
        int[] classHeights = new int[4];

        classHeights[0] = 180;
        classHeights[1] = 172;
        classHeights[2] = 182;
        classHeights[3] = 183;

        System.out.println(classHeights[0] + " " + classHeights[1] + " " + classHeights[2] + " " + classHeights[3]);

        int person1Height = 180;
        int person2Height = 180;

//        ...

        System.out.println(person1Height);
    }
}
