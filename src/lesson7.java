public class lesson7 {
    public static void main (String[] args) {
//      Method activity
//        A school would like to figure out the tallest people in each class and the avg height of each class.
//        The heights of people in meters are given in a 2d array of double like this:
//        {{1.82, 1.45, 2.01, 2.04, 4.82, 5.45, 2.01, 4.04}, {3.82, 2.45, 5.01, 2.44, 4.00, 9.45, 3.01, 4.42}, {4.82, 6.45, 7.01, 2.04, 1.85, 3.45, 3.01, 3.04}}
//        Use methods and loops as needed but have at least one method and one loop and try to write as few lines as possible

        double[][] schoolHeights = {
                {1.82, 1.45, 2.01, 2.04, 4.82, 5.45, 2.01, 4.04},
                {3.82, 2.45, 5.01, 2.44, 4.00, 9.45, 3.01, 4.42},
                {4.82, 6.45, 7.01, 2.04, 1.85, 3.45, 3.01, 3.04}
        };

//      Looping through classes
        for (int i = 0; i < schoolHeights.length; i++) {
            System.out.println("Tallest person in class " + (i + 1) + " is " + getMax(schoolHeights[i]) +
                    " meters tall and the avg height is " + getAverage(schoolHeights[i]) + " meters.");
        }
    }

    public static double getMax(double[] nums) {
        double max = 0;

        for (double num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static double getAverage(double[] nums) {
        double sum = 0;

        for (double num : nums) {
            sum += num;
        }

        return sum/nums.length;
    }
}
