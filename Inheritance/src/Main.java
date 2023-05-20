import java.util.Objects;
import java.util.Scanner;

class Parent {
    String familyName;

    String motherName;

    String fatherName;

    Parent () {
        familyName = "somani";
        fatherName = "harish";
        motherName = "radhika";
    }

    Parent (String familyName, String motherName, String fatherName) {
        this.familyName = familyName;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }
}

class Child extends Parent {
    String name;

    String gender;
    Child() {
        super();
        name = "yash";
    }
    Child (String name, String familyName, String motherName, String fatherName, String gender) {
        super( familyName,  motherName,  fatherName);
        this.name = name;
        this.gender = gender;
    }
    void display () {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Family Name : " + familyName);
        System.out.println("Father Name : " + fatherName);
        System.out.println("Mother Name : " + motherName);
    }
}


public class Main {
    Scanner scan = new Scanner(System.in);

    void displayMenu (Child[] children) {
        System.out.println("Enter 1 to add details");
        System.out.println("Enter 2 to search details");
        System.out.println("Enter 3 to update details");
        System.out.println("Enter 4 to exit");
        int choice = scan.nextInt();
        String flush = scan.nextLine();
        switch(choice) {
            case 1 -> {
                String familyName, motherName, fatherName, name;
                String gender;
                for (int i = 0 ; i < 5 ; i++) {
                    System.out.println("Enter the name of the family");
                    familyName = scan.nextLine();
                    System.out.println("Enter the name of the mother");
                    motherName = scan.nextLine();
                    System.out.println("Enter the name of the father");
                    fatherName = scan.nextLine();
                    System.out.println("Enter the name of the child");
                    name = scan.nextLine();
                    System.out.println("Enter the gender of the child");
                    gender = scan.nextLine();

                    children[i] = new Child(name, familyName, motherName, fatherName, gender);

                }
                displayMenu(children);

            }
            case 2 -> {
                System.out.println("Enter the name to be searched");
                String name = scan.nextLine();
                int c = 0;
                for (int i = 0 ; i < 5 ; i++) {
                    if (Objects.equals(children[i].name, name)) {
                        children[i].display();
                    } else {
                        c++;
                    }
                }
                if (c == 5) {
                    System.out.println("No such name found");
                }

                displayMenu(children);
            }
            case 3 -> {
                System.out.println("Enter the name to be updated");
                String name1 = scan.nextLine();
                int c = 0;
                for (int i = 0 ; i < 5 ; i++) {
                    if (Objects.equals(children[i].name, name1)) {
                        System.out.println("Enter the name of the family");
                        children[i].familyName = scan.nextLine();
                        System.out.println("Enter the name of the mother");
                        children[i].motherName = scan.nextLine();
                        System.out.println("Enter the name of the father");
                        children[i].fatherName = scan.nextLine();
                        System.out.println("Enter the name of the child");
                        children[i].name = scan.nextLine();
                        System.out.println("Enter the gender of the child");
                        children[i].gender = scan.nextLine();
                    } else {
                        c++;
                    }
                }
                if (c == 5) {
                    System.out.println("No such name found");
                }

                displayMenu(children);
            }
            case 4 -> {
                break;
            }

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Parent[] parents;
        parents = new Parent[5];
        Child[] children = new Child[5];
//        String familyName, motherName, fatherName, name;
//        char gender;
//        for (int i = 0 ; i < 5 ; i++) {
//            System.out.println("Enter the name of the family");
//            familyName = scan.nextLine();
//            System.out.println("Enter the name of the mother");
//            motherName = scan.nextLine();
//            System.out.println("Enter the name of the father");
//            fatherName = scan.nextLine();
//            System.out.println("Enter the name of the child");
//            name = scan.nextLine();
//            System.out.println("Enter the gender of the child");
//            gender = scan.next().charAt(1);
//
//            parents[0] = new Parent();
//            children[0] = new Child(name, familyName, motherName, fatherName, gender);
//
//        }
        Main main = new Main();
        main.displayMenu(children);

        Child yash = new Child();

    }
}