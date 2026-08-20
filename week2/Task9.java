import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even numbers from 1 to " + n + ": " + count);
        sc.close();
    }
}
