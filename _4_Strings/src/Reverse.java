import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string");
        String text = scan.nextLine();
        String newText = text.toUpperCase();
        char[] arr = newText.toCharArray();

        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i + 1 ; j < arr.length ; j++ ) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i] ;
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);


    }
}
