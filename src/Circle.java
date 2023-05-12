import java.util.Scanner;

public class Circle {


    float radius;
    float circum;

    Circle () {
        circum =2 * 3.14f * 5 ;
        System.out.println("The circumference is : " + circum);
    }
    Circle (float pi, float r) {
        radius = r;
        circum = 2 * pi * r ;
        System.out.println("The circumference is : " + circum);
    }

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius or -1 to get default radius");
        float r = scan.nextFloat();
        float pi = 3.14f;
        if (r != -1) {
            System.out.println("Enter the value of pi or -1 to get default radius");
            pi = scan.nextFloat();
        }

        if ( r == -1 || pi == -1) {
            Circle cir = new Circle();
        } else {
            Circle cir = new Circle(pi, r);
        }
    }
}