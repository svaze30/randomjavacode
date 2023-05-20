class Employee {
    int salary = 10_000;
    int bonus = 0;
    int getSalary () {
        System.out.println("The salary is : " + salary );
        return salary;
    }
    int getBonus () {
        System.out.println("The Bonus is " + bonus);
        return bonus;
    }
    void printSalary() {
        System.out.println("Final salary is : " + (salary + bonus));
    }
}
class Intern extends Employee {
    int salary = 3 * (super.salary) / 4;

    int bonus = super.bonus + 1000;
    int getSalary () {
        System.out.println("The salary is : " + salary );
        return salary;
    }
    int getBonus () {
        System.out.println("The Bonus is " + bonus);
        return bonus;
    }
    void printSalary() {
        System.out.println("Final salary is : " + (salary + bonus));
    }
}
class Clerk extends Employee {
    int salary = super.salary / 2;
    int bonus = super.bonus + 500;
    int getSalary () {
        System.out.println("The salary is : " + salary );
        return salary;
    }
    int getBonus () {
        System.out.println("The Bonus is " + bonus);
        return bonus;
    }
    void printSalary() {
        System.out.println("Final salary is : " + (salary + bonus));
    }
}
class Manager extends Employee {
    int salary = super.salary * 2;
    int bonus = super.bonus + 2000;
    int getSalary () {
        return salary;
    }
    int getBonus () {
        return bonus;
    }
    void printSalary() {
        System.out.println("Final salary is : " + (salary + bonus));
    }
}
public class Main {
    public static void main(String[] args) {
        Intern swaroop = new Intern();
        System.out.println("The salary is : " + swaroop.salary );
        System.out.println("The Bonus is " + swaroop.bonus);
        swaroop.printSalary();
        Clerk extcwaala = new Clerk();
        System.out.println("The salary is : " + extcwaala.salary );
        System.out.println("The Bonus is " + extcwaala.bonus);
        extcwaala.printSalary();
        Manager gujju = new Manager();
        System.out.println("The salary is : " + gujju.salary );
        System.out.println("The Bonus is " + gujju.bonus);
        gujju.printSalary();



    }
}