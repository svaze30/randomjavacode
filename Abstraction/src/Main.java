import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks{
    Scanner scan = new Scanner(System.in);
    double a, b , c;
    A () {
        System.out.println("Enter the marks in subject 1 out of 100");
        a = scan.nextDouble();
        System.out.println("Enter the marks in subject 2 out of 100");
        b = scan.nextDouble();
        System.out.println("Enter the marks in subject 3 out of 100");
        c = scan.nextDouble();

    }

    @Override
    double getPercentage() {
        return (a+b+c)/3;
    }
}
class B extends Marks{
    Scanner scan = new Scanner(System.in);
    double a, b , c, d;
    B () {
        System.out.println("Enter the marks in subject 1 out of 100");
        a = scan.nextDouble();
        System.out.println("Enter the marks in subject 2 out of 100");
        b = scan.nextDouble();
        System.out.println("Enter the marks in subject 3 out of 100");
        c = scan.nextDouble();
        System.out.println("Enter the marks in subject 4 out of 100");
        d = scan.nextDouble();

    }
    @Override
    double getPercentage() {
        return (a+b+c+d)/4;
    }
}
public class Main {
    public static void main(String[] args) {
        A svaze = new A();
        System.out.println("The percentage gained is : " + svaze.getPercentage());
        B svaze1 = new B();
        System.out.println("The percentage gained is : " + svaze1.getPercentage());

    }
}