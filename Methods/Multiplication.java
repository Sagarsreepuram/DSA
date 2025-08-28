package Methods;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        multi(num);
    }
    static void multi(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+i*num);
        }
    }
}
