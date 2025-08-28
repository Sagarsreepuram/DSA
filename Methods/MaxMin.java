package Methods;
import java.util.*; 

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 3 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = Max(a, b, c);
        int res1 = Min(a, b, c);
        System.out.println(res + " is the Greatest Number"); 
        System.out.println(res1 + " is the smallest Number"); 
    }

    static int Max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) { // No need to check `b > a` again
            return b;
        } else {
            return c;
        }
    }
    static int Min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) { // No need to check `b > a` again
            return b;
        } else {
            return c;
        }
    }
    
}
