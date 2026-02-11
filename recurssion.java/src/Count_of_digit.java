public class Count_of_digit
{

    // Recursive method to count digits
    public static int countDigits(int number) {
        // Base case: if the number is 0, return 0
        if (number == 0) {
            return 0;
        }
        // Recursive case: reduce the number by dividing it by 10
        return  countDigits(number / 10)+1;
    }

    public static void main(String[] args) {
        int number = 123456; // Example number
        int digitCount = countDigits(Math.abs(number)); // Call the recursive function

        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }
}
