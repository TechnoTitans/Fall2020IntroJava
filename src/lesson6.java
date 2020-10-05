public class lesson6 {
    public static void main (String[] args) {
//      Method activity
//        A school would like to figure out the tallest people in each class and the avg height of each class.
//        The heights of people in m are given in a double array like this:
//        {{1.82, 1.45, 2.01, 2.04, 4.82, 5.45, 2.01, 4.04}, {3.82, 2.45, 5.01, 2.44, 4.00, 9.45, 3.01, 4.42}, {4.82, 6.45, 7.01, 2.04, 1.85, 3.45, 3.01, 3.04}}
//        Use methods and loops as needed but have at least one method and one loop and try to write as few lines as possible

        System.out.println("Hello");
        myMethod();
        System.out.println(xSquared(4));
        System.out.println(xSquared(4.38543));

        int[] joe = {4, 5, 6, 3};
        int[] bobby = {4, 5, 6, 4, 5};

        System.out.println(personSum(joe));
        System.out.println(personSum(bobby));

//      DRY: Don't Repeat Yourself

        System.out.println("==================");

//      Pass by Reference
        int[] arrayOne = {3, 5};

//      passed by reference, so arrayTwo is alias of arrayOne
        int[] arrayTwo = arrayOne;

        arrayTwo[0] = 4;

        System.out.println(arrayOne[0]);

        String oneStr = "joe";
        String twoStr = oneStr;

        twoStr = "bob";

        System.out.println(oneStr);

//      Passed by value
        int one = 4;
        int two = one;

        two++;

        System.out.println(one);

        int y = 5;
        demo(y);
        System.out.println(y);

        String a = "chicken";
        demoStr(a);
        System.out.println(a);
    }

    static void demoStr(String b) {
        b = "bobby";
        System.out.println(b);
    }

    static void demo (int x) {
        x++;
        System.out.println(x);
    }

//  Void method (Doesn't return anything)
//  No parameters
    static void myMethod () {
        System.out.println("Cool");
    }

    static int personSum (int[] person) {
        int sum = 0;
        for (int num : person) {
            sum += num;
        }
        return sum;
    }

//  Method overloading: Same method name, different signature (param order, type, number)
//  Returns integers
//  takes in an integer parameter
    static int xSquared (int x) {
        System.out.println("heyy 1");
        return x * x;
//        return (int) Math.pow(x, 2);
    }

    static double xSquared (double x) {
        System.out.println("heyy 2");
//        return x * x;
        return Math.pow(x, 2);
    }
}
