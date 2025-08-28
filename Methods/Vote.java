package Methods;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Your Age");
     int age = sc.nextInt();
     String res = Election(age);
     System.out.println(res);
    }
    static String Election(int age){
        if(age > 18){
            return "You r Eligible for Vote";
        }else{
            return "You r not Eligible for Vote";
        }

    }



}
