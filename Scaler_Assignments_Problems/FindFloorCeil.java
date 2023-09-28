public class FindFloorCeil {
    public static double myFloor(double number) {
        // Check if the number is already an integer
        if (number == (int) number) {
            return number; // No need to change, it's already a whole number
        }

        // For negative numbers, subtract 1 before casting to int
        if (number < 0) {
            return (int) (number - 1);
        }

        // For positive numbers, simply cast to int
        return (int) number;
    }

    public static double myCeil(double number) {
        // Check if the number is already an integer
        if (number == (int) number) {
            return number; // No need to change, it's already a whole number
        }

        // For negative numbers, simply cast to int
        if (number < 0) {
            return (int) number;
        }

        // For positive numbers, add 1 before casting to int
        return (int) (number + 1);
    }

    public static void main(String[] args) {
        double number = -7.8;
        double floorValue = myFloor(number);
        System.out.println("My floor value of " + number + " is " + floorValue); // Output: My floor value of 7.8 is 7.0

        // double number = 7.2;
        double ceilValue = myCeil(number);
        System.out.println("My ceiling value of " + number + " is " + ceilValue); // Output: My ceiling value of 7.2 is 8.0

        System.out.println(Math.round(7.4));
    }
}
