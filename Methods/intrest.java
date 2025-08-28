// Write a Java program to calculate the interest on a given amount. Assume a fixed percentage (say 10%).


package Methods;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        int amount = sc.nextInt();

        System.out.println("Enter Rate of Interest:");
        int rate = sc.nextInt();

        System.out.println("Enter Time (in years):");
        int time = sc.nextInt();

        interest(amount, rate, time);
    }

    static void interest(int amount, int rate, int time) {
        int si = (amount * rate * time) / 100;
        System.out.println("Simple Interest is: " + si);
    }
}



// 🔑 Core Logic

// Formula for Simple Interest:

// 𝑆𝐼 = 𝑃 × 𝑅 × 𝑇
//         100

// where:

// P = Principal (amount)

// R = Rate of interest

// T = Time (years)

// In your program:

// You only used amount × 10 / 100, which means R = 10, T = 1 year.

// That’s why it just gives 10% of amount.

// Better: Take amount, rate, and time from the user for flexibility.