import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    int year, month, date, hrs, min, sec;

    Date() {
        year = 2000;
        month = 1;
        date = 1;
        hrs = min = sec = 0;
    }

    void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    void setDate(int year, int month, int date, int hrs, int min) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }

    void setDate(int year, int month, int date, int hrs, int min, int sec) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    void displayDate () {
        String Month = "January";
        switch (month) {
            case 1 -> Month = "January";
            case 2 -> Month = "February";
            case 3 -> Month = "March";
            case 4 -> Month = "April";
            case 5 -> Month = "May";
            case 6 -> Month = "June";
            case 7 -> Month = "July";
            case 8 -> Month = "August";
            case 9 -> Month = "September";
            case 10 -> Month = "October";
            case 11 -> Month = "November";
            case 12 -> Month = "December";
        }
        System.out.println("The Date is " + Month + " "+ date + ", "+year + ", "+hrs +":"+ min +":"+ sec);
    }
    void alqaeda (int year, int month, int date, int hrs, int min, int sec) {
        LocalDateTime datetime1 = LocalDateTime.now();
        LocalDateTime datetime2 = datetime1.minusYears(year);
        LocalDateTime datetime3 = datetime1.minusMonths(month);
        LocalDateTime datetime4 = datetime1.minusDays(date);
        LocalDateTime datetime5 = datetime1.minusHours(hrs);
        LocalDateTime datetime6 = datetime1.minusMinutes(min);
        LocalDateTime datetime7 = datetime1.minusSeconds(sec);
        System.out.println("Before Formatting: " + datetime2);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = datetime7.format(format);
        System.out.println("After Formatting: " + formatDateTime );

        System.out.println("The Date is "  + " "+ date + ", "+year + ", "+hrs +":"+ min +":"+ sec);
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.setDate(2001, 9,11,5,44,20);
        date.displayDate();
        date.alqaeda(2040, 10, 13, 1, 10, 20);

    }
}
