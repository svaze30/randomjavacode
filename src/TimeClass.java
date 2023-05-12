import java.util.Scanner;

public class TimeClass {


    int sec;
    int min;
    int hrs;
    int totSec;


    void conversion1 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        totSec = scan.nextInt();
        hrs = totSec/3600;
        min = totSec/60 - hrs * 60;
        sec = totSec % 60 ;
        System.out.println("Time is - " + hrs + " : " + min + " : " + sec);
    }

    void conversion2 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hours");
        hrs = scan.nextInt();
        System.out.println("Enter the minutes");
        min = scan.nextInt();
        System.out.println("Enter the seconds");
        sec = scan.nextInt();
        int totSec = 3600*hrs + 60*min + sec;
        System.out.println("Total seconds passed are - " + totSec);
    }



    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1 to convert seconds to hrs min sec or any other for vice versa");
        int choice = scan.nextInt();
        if (choice == 1) {
            TimeClass time = new TimeClass();
            time.conversion1();
        } else {
            TimeClass time = new TimeClass();
            time.conversion2();
        }


    }


}