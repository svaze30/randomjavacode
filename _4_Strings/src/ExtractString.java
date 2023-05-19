import java.util.Scanner;

public class ExtractString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String");
        String txt = scan.nextLine();

        System.out.println("Enter the starting index");
        int s = scan.nextInt();
        System.out.println("Enter the Ending index");
        int e = scan.nextInt();

        String ans = "";
        for (int i = s ; i < e ; i++) {
            ans += txt.charAt(i);
        }

        System.out.println(ans);
    }
}
