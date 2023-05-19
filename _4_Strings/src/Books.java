import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of books you want to add");
        int n = scan.nextInt();
        System.out.println("Enter the number of ratings you want to add");
        int r = scan.nextInt();

        int[][] books = new int[n][r];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < r ; j ++) {
                System.out.println("Enter the rating " + (j+1)+ " of book " + (i+1) );
                books[i][j] = scan.nextInt();
            }
        }
        int[ ] ratings = new int[n];

        for (int i = 0 ; i < n ; i++){
            ratings[i] = 0;
            for (int j =0 ; j < r;j++) {
                ratings[i] += books[i][j];
            }
        }
        int max = -1;
        int maxi = 0;
        for (int i = 0 ; i < n ; i++) {

                if (max < ratings[i]) {
                    max = ratings[i];
                    maxi = i;

                }
        }
        System.out.println("Book " + (maxi+1) + " is the most popular");

    }
}
