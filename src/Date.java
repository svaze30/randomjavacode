import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Date {
    private int year;
    private int month;
    private int date;
    private int hrs;
    private int min;
    private int sec;

    // Default constructor
    public Date() {
        this(2000, 1, 1, 0, 0, 0);
    }

    // Constructor with date only
    public Date(int year, int month, int date) {
        this(year, month, date, 0, 0, 0);
    }

    // Constructor with date and time
    public Date(int year, int month, int date, int hrs, int min) {
        this(year, month, date, hrs, min, 0);
    }

    // Constructor with date, time, and seconds
    public Date(int year, int month, int date, int hrs, int min, int sec) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    // Setter method for date only
    public void setDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // Setter method for date and time
    public void setDate(int year, int month, int date, int hrs, int min) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
    }

    // Setter method for date, time, and seconds
    public void setDate(int year, int month, int date, int hrs, int min, int sec) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    // Display the date depending on the type of Date object created
    public void displayDate() {
        String formattedDate = String.format("%02d/%02d/%04d", date, month, year);
        String formattedTime = String.format("%02d:%02d:%02d", hrs, min, sec);

        if (hrs == 0 && min == 0 && sec == 0) {
            System.out.println("Date: " + formattedDate);
        } else {
            System.out.println("Date: " + formattedDate + " Time: " + formattedTime);
        }
    }

    // Calculate the number of days left for the explosion
    public long daysUntilExplosion() {
        LocalDate currentDate = LocalDate.now();
        LocalDate explosionDate = LocalDate.of(year, month, date);
        long daysLeft = ChronoUnit.DAYS.between(currentDate, explosionDate);

        return daysLeft;
    }

    public static void main(String[] args) {
        Date defaultDate = new Date();
        defaultDate.displayDate(); // Output: Date: 01/01/2000

        Date dateWithTime = new Date(2023, 5, 20, 12, 30, 0);
        dateWithTime.displayDate(); // Output: Date: 20/05/2023 Time: 12:30:00

        Date explosionDate = new Date(2023, 12, 31, 23, 59, 59);
        long daysLeft = explosionDate.daysUntilExplosion();
        System.out.println("Days left until explosion: " + daysLeft);
    }
}