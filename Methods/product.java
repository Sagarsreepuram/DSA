package Methods;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = sum(a,b);
        System.out.println("The sum of "+a+" and "+b+" Numbers is: "+res);

    }
    static int sum(int a, int b){
        return a*b;
    }
    
}
