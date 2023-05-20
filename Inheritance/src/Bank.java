import java.util.Calendar;
import java.util.Scanner;

public class Bank {
    double rateOfInterest = 2;
    void get_rate_of_interest() {
        System.out.println("The rate of interest is " + rateOfInterest + "%");
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the period of interest ");
        int period = scan.nextInt();



        Calendar calendar = Calendar.getInstance();
        Scanner myobj=new Scanner(System.in);




        System.out.println("The current date is : " + calendar.getTime());
        calendar.add(Calendar.DATE, period);
        System.out.println(period+" days later: MATURITY DATE IS : " + calendar.getTime());

        SBI_Bank aayush = new SBI_Bank();
        aayush.get_rate_of_interest(10000,period);
        ICICI_Bank aayush1 = new ICICI_Bank();
        aayush1.get_rate_of_interest(12500,period);
        AXIS_Bank aayush2 = new AXIS_Bank();
        aayush2.get_rate_of_interest(20000,period);


    }
}

class SBI_Bank extends Bank {
    double rateOfInterest;
    void get_rate_of_interest(double amount, int period) {
        if (period <= 14 && period >= 7)
            rateOfInterest = 3;
        if (period <= 30 && period >= 15)
            rateOfInterest = 3;
        if (period <= 45 && period >= 31)
            rateOfInterest = 3;
        if (period <= 90 && period >= 46)
            rateOfInterest = 4.05;
        if (period <= 120 && period >= 91)
            rateOfInterest = 4.10;
        if (period <= 180 && period >= 121)
            rateOfInterest = 4.10;
        System.out.println("The rate of interest is " + rateOfInterest + "% in SBI");
        double compInt = amount * Math.pow(1+period,0.00273972602);
        System.out.println("The compound interest for " + amount + " rupees is " + compInt);
    }

}class ICICI_Bank extends Bank {
    double rateOfInterest;
    void get_rate_of_interest(double amount, int period) {
        if (period <= 14 && period >= 7)
            rateOfInterest = 3.10;
        if (period <= 30 && period >= 15)
            rateOfInterest = 3.20;
        if (period <= 45 && period >= 31)
            rateOfInterest = 3.50;
        if (period <= 90 && period >= 46)
            rateOfInterest = 4.50;
        if (period <= 120 && period >= 91)
            rateOfInterest = 4.70;
        if (period <= 180 && period >= 121)
            rateOfInterest = 4.90;
        System.out.println("The rate of interest is " + rateOfInterest + "% in ICICI");
        double compInt = amount * Math.pow(1+period,0.00273972602);
        System.out.println("The compound interest for " + amount + " rupees is " + compInt);
    }

}class AXIS_Bank extends Bank {
    double rateOfInterest;
    void get_rate_of_interest(double amount, int period) {
        if (period <= 14 && period >= 7)
            rateOfInterest = 3.15;
        if (period <= 30 && period >= 15)
            rateOfInterest = 3.15;
        if (period <= 45 && period >= 31)
            rateOfInterest = 3.45;
        if (period <= 90 && period >= 46)
            rateOfInterest = 4.05;
        if (period <= 120 && period >= 91)
            rateOfInterest = 4.70;
        if (period <= 180 && period >= 121)
            rateOfInterest = 5.00;
        System.out.println("The rate of interest is " + rateOfInterest + "% in AXIS");
        double compInt = amount * Math.pow(1+period,0.00273972602);
        System.out.println("The compound interest for " + amount + " rupees is " + compInt);
    }

}