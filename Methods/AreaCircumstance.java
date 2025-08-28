package Methods;
import  java.util.Scanner;

public class AreaCircumstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = radius(r);
        double circumference = circumstance(r);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }   
    static double  radius(int r){
        return Math.PI*r*r;
    }
    static double  circumstance(int r){
        return 2*Math.PI*r;
    }
}
