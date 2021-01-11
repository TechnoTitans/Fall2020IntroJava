public class lesson8OOP {
    public static void main(String args[]) {
        System.out.println(5);

        Cat cat1 = new Cat("Tom", "Grey", 15.5, 50.0);

        cat1.sleep();

        Cat cat2 = new Cat("Michelle", "Violet", 150, 5.98);

        System.out.println(cat2.jumpToHeight(100));
    }
}

//  Model a Robot
//    - Instance variables: name, and a few other ones
//    - Methods: a few methods such as actions the robot can perform
//  From your main method, create a few robot instances and have them do things
