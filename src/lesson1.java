public class lesson1 {
    public static void main(String[] args) {
//      Decision making
//      Condition boils down to be a boolean
        boolean chicken = true;

//      ! is a not
        if (!chicken) {
            System.out.println("if is true");
        }

        if (5 == 5) {
            System.out.println("second if is true");
        } else {
            System.out.println("if above is not true");
        }

        if (5 > 6.4645) {
            System.out.println("(part of else if) if is true");
        } else if (7.6 <= 7.6) {
            System.out.println("else if is true");
        } else {
            System.out.println("everything above is not true");
        }

//      =======================
        int y = 7;

//      Casting (datatype)
//      double solution = (double) y / 3;
        double solution = y / 3.0;

        System.out.println(solution);

//      Arithmetic operations
        int x = 67;

        x = x - 1;
        x -= 1;
        x--;

//      Modulus
        System.out.println(x / 5.0);
        x = x % 4;

        System.out.println(x);

//      Primitive Data types:
//        - boolean: true/false
//        - double: number with decimals (has more decimal points)
//        - int: number without decimals
//        - char: a single character

//        ========================================
//        - float: number with decimals
//        - byte: number without decimal (8 bits)
//        - short: number without decimal (16 bits)
//        - long: number without decimal (32 bits)
//        ========================================

//      Other data types (objects):
//        - Strings: text basically

        int age = 13;

//      These are the same thing:
        String name = "Berkan";
//      String name = new String("Berkan");

        System.out.println(name + " is " + age + " years old.");
    }
}
