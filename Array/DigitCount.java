// How to count the number of digits in an integer in Java?


public class DigitCount{
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;      // Increment the count
        }
        
        System.out.println("Number of digits: " + count);
    }
}


// 🔑 Core Logic of Your Program

// Idea: A number has as many digits as the number of times you can divide it by 10 before it becomes 0.

// Example: 123456 → 12345 → 1234 → … → 0 → took 6 steps → 6 digits.

// Implementation:

// Initialize a count = 0.

// Repeatedly do number = number / 10 (removes last digit).

// For each removal, increment count.

// When number becomes 0, count holds the total digits.

// Output: Print count.