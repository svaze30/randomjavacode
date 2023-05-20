class Mammal {
    String category;
    int legs;
}

class Dog extends Mammal {
    String name;
    int age;


    void calculateLifeExpectancy() {

    }
    void popularBreed() {

    }
}

class Labrador extends Dog {
    int weight = 5;
    Labrador(int weight) {
        this.weight = weight;
    }
    String color;
    public String speak() { return "WOOF"; }
    static int sum = 0;
    static float no = 0f;
    float calculateAvgWeight() {
        sum += weight;
        no++;
        return sum/no;
    }

}

class GermanShepherd extends Dog {
    int height;
    GermanShepherd(int height) {
        this.height = height;
    }
    int lifespan;
    static int sum = 0;
    static float no = 0f;
    public String speak() { return "GRUNT"; }
    static int sum1 = 0;
    static float no1 = 0f;
    float calculateAvgHeight () {
        sum1 += height;
        no1++;
        return sum1/no1;
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador laby = new Labrador(10);
        laby.calculateAvgWeight();Labrador laby1 = new Labrador(11);
        laby1.calculateAvgWeight();Labrador laby2 = new Labrador(12);
        laby2.calculateAvgWeight();Labrador laby3 = new Labrador(13);
        laby3.calculateAvgWeight();Labrador laby4 = new Labrador(14);
        laby4.calculateAvgWeight();Labrador laby5 = new Labrador(15);
        System.out.println("Average weight ");
        System.out.println(laby5.calculateAvgWeight());

    }
}