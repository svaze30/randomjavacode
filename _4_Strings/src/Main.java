import java.util.Scanner;

public class Main {
    // i day and j city
    Scanner scan = new Scanner(System.in);
    void inputArray (int[][] arr) {
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }

    static void highMonth(int[][] arr) {
        int max = -273;
        int maxi=0,maxj=0;
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    maxi=i;
                    maxj = j;
                }
            }
        }
        System.out.println("The highest temperature is on " + maxi + " day and in " + maxj + " city");
    }
static void lowMonth (int[][] arr) {
    int min = 273;
    int mini=0,minj=0;
    for (int i = 0 ; i < 3 ; i++) {
        for (int j = 0 ; j < 3 ; j++) {
            if (arr[i][j] <= min) {
                min = arr[i][j];
                mini=i;
                minj = j;
            }
        }
    }
        System.out.println("The lowest temperature is on " + mini + " day and in " + minj + " city");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of cities ");
        int n = scan.nextInt();

        String[] cities = new String[n];
        String s = scan.nextLine();
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Enter the name of city " + (i+1));
            cities[i] = scan.nextLine();
        }




        int[][] arr = new int[3][3];

        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0 ; i < n ; i++) {
            System.out.print("\t" + cities[i]);
        }
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Day " + i+1 + "\t");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }



        System.out.println("Enter 1 to find the highest temperature for a day");
        System.out.println("Enter 2 to find the highest temperature for a month");
        System.out.println("Enter 3 to find the lowest temperature for a day");
        System.out.println("Enter 4 to find the lowest temperature for a month");

        int choice = scan.nextInt();

        switch (choice) {
            case 1 ->
                highMonth(arr);
            case 4 ->
                lowMonth(arr);

        }







    }
}