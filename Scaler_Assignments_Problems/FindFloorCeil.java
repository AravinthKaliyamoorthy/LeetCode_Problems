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

        System.out.println(Math.round(7.5));

        double doubleValue = 7.8;

        // Convert double to binary representation
        long bits = Double.doubleToLongBits(doubleValue);

        // Cast the bits to an int (removing the fractional part)
        int intValue = (int) bits;

        // Print the original double value, binary representation, and casted int value
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Binary representation (as a long integer): " + Long.toBinaryString(bits));
        System.out.println("Casted int value: " + intValue);
        System.out.println("Directly converting double to int : " + (int)doubleValue);

        int result = 0, n = 353;
        while(n>0){
            n/=10;
            result++;
        }
        System.out.println(result);
    }
}
