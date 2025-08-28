package Methods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res = FindNum(a);
        System.out.println(res);
    }

    static String FindNum(int a){
          if(a%2 == 0){
            return "Even";
          }else{
            return "Odd";
          }
    }
}
