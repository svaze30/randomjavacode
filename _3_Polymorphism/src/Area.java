import java.util.Scanner;

public class Area {

    static double area;

    static void findArea(double radius) {
        area = (3.14 * radius * radius);
        System.out.println("The area of circle is : " + area);

    }
    static void findArea(double length, double breadth) {
        area = (length * breadth);
        if (length == breadth) {

            System.out.println("The area of square is : " + area);
        } else {
            System.out.println("The area of rectangle is : " + area);
        }


    }
    static void findArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        System.out.println("The area of triangle is : " + area);
    }

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        Area obj = new Area();
        System.out.println("Enter 1 for finding area of square");
        System.out.println("Enter 2 for finding area of circle");
        System.out.println("Enter 3 for finding area of rectangle");
        System.out.println("Enter 4 for finding area of triangle");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter the side of the square");
                double side = scan.nextDouble();
                findArea(side, side);
            }
            case 2 -> {
                System.out.println("Enter the radius of the circle");
                double circle = scan.nextDouble();
                findArea(circle);
            }
            case 3 -> {
                System.out.println("Enter the length of the rectangle");
                double length = scan.nextDouble();
                System.out.println("Enter the breadth of the rectangle");
                double breadth = scan.nextDouble();
                findArea(length, breadth);
            }
            case 4 -> {
                System.out.println("Enter the side 1 of the triangle");
                double side1 = scan.nextDouble();
                System.out.println("Enter the side 2 of the triangle");
                double side2 = scan.nextDouble();
                System.out.println("Enter the side 3 of the triangle");
                double side3 = scan.nextDouble();
                findArea(side1, side2, side3);
            }
        }

    }
}

