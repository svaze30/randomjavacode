import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students ");
        int n = scan.nextInt();

        double[] grade = new double[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Enter the grade for student " + (i+1));
            grade[i] = scan.nextDouble();
        }

        double min = 101;
        double max = -1;
        double avg = 0;
        double sum = 0;
        double squareSum = 0;
        for (int i = 0 ; i < n ; i++) {
            if (min >= grade[i]) {
                min = grade[i];
            }
            if (max <= grade[i]) {
                max = grade[i];
            }
            sum += grade[i];
        }

        avg = sum / n;
        for (int i = 0 ; i < n ; i++) {

            squareSum += (grade[i]-avg) * (grade[i]-avg);
        }
        double stddev = Math.sqrt(squareSum/n);
        System.out.println("The average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);

        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n ; j++) {
                if (grade[i] <= grade[j]) {
                    double temp = grade[i];
                    grade[i] = grade[j];
                    grade[j] = temp;
                }
            }
        }
        double median = (grade[n/2] + grade[(n-1)/2])/2;
        System.out.println("The median is " + median);
        System.out.println("The Standard deviation is " + stddev);

    }
}
