import java.util.Scanner;

class Movie {
    String name, type , hero , heroine;
    int budget;
}


public class MovieWatch {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Movie[] movies = new Movie[3];

        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Enter the name of the movie " + (i+1));
            movies[i].name = scan.nextLine();
            System.out.println("Enter the type of the movie " + (i+1));
            movies[i].type = scan.nextLine();
            System.out.println("Enter the name of the hero " + (i+1));
            movies[i].hero = scan.nextLine();
            System.out.println("Enter the name of the heroine " + (i+1));
            movies[i].heroine = scan.nextLine();
            System.out.println("Enter the budget of the movie " + (i+1));
            movies[i].budget = scan.nextInt();
        }

        for (int i = 0 ; i < 3 ; i ++) {
            for (int j = i ; j < 3 ; j++) {

            }
        }

    }
}
