public class Test {
    double base;
    int power;
    int logBase;

    Test () {
        base = 2;
        power = 2;
        logBase = 2;
    }


    double calculate (double base, int power) {
        return Math.pow(base, power);
    }
    double calculate (int logBase, int argument) {
        return Math.log(argument) / Math.log(logBase);
    }

    static void display(double d) {
        System.out.println("the value is " + d);
    }
    public static void main(String[] args) {
        Test tt = new Test();
        display(tt.calculate(2,4));
        display(tt.calculate(2.0,4));
    }
}
