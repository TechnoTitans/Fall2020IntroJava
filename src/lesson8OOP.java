public class lesson8OOP {
    public static void main(String args[]) {
        System.out.println(5);

//      cat1 has a datatype Cat
//      New keywords creates an instance of the Cat class
        Cat cat1 = new Cat("Tom", "Grey", 15.5, 50.0);

//      Calling a method from cat1
        cat1.sleep();

        cat1.setName("tommy");

        System.out.println(cat1.getName());

        Cat cat2 = new Cat("Michelle", "Violet", 150, 5.98);

        System.out.println(cat2.jumpToHeight(100));

        System.out.println("============================================");

        Leopard leo = new Leopard(80, 23.1, "Leo", "Orange", 50, 100);

        System.out.println(leo.climbLargeTree(49));
        leo.sleep();
    }
}

//  Task 1:
//  Model a Robot
//    - Instance variables: name, and a few other ones
//    - Methods: a few methods such as actions the robot can perform
//  From your main method, create a few robot instances and have them do things

//  Task 2:
//  Model a Boat
//    - Instance variables: name, and a few other ones
//    - Methods: a few methods such as actions the boat can perform
//       - Also create getters and setters for each instance variable
//       - use a for loop in one of your methods for something
//  From your main method, create a 2 Boat instances and have them do things

//Task 3:
//Model a Boat
//- Instance variables: name, and a few other ones
//- Methods: a few methods such as actions the boat can perform
//   - Also create getters and setters for each instance variable
//   - use a for loop in one of your methods for something
//From your main method, create a 2 Boat instances and have them do things
//Also, create a Jet-ski class, and a cruise ship class
//- Add any additional instance variables/methods that those specific object would have
//- Use a loop somewhere for both