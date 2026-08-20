import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();

        System.out.println("Length = " + s.length());
        System.out.println("Uppercase = " + s.toUpperCase());
        sc.close();
    }
}
