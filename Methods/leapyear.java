// Check whether a year is a leap year or not

// Input: 2000 → Leap Year (divisible by 400)  
// Input: 1900 → Not a Leap Year (divisible by 100 but not 400)  
// Input: 2024 → Leap Year (divisible by 4, not by 100)  
// Input: 2023 → Not a Leap Year

package Methods;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year");
        int yr = sc.nextInt();
        leapyear(yr);
    }
    static void leapyear(int yr){
       if(yr%400 == 0 || yr%100!=0 && yr%4 == 0){
        System.out.print("Leap Year");
       }else{
        System.out.println("Not a Leap Year");
       }
    }
    
}


// 🔑 Core Logic (Leap Year Rule)

// A year is a leap year if:

// It is divisible by 400 → Always leap year.

// Else if it is divisible by 4 but not divisible by 100 → Leap year.

// Otherwise → Not a leap year.