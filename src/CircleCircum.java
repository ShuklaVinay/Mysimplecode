//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class CircleCircum {
    public static double circumferenceC(double r){
        return 2*3.14*r;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radious of circle");
        double r=sc.nextDouble();
        System.out.println("circumference of circle="+" "+circumferenceC(r));
    }
}
