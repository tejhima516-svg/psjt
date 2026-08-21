import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int count = scanner.nextInt();
        String[] numbers = new String[count];
        System.out.println("Enter values:");
        for (int index = 0; index < count; index++) {
            numbers[index] = scanner.next();
        }

        Arrays.sort(numbers, (first, second) -> (second + first).compareTo(first + second));
        System.out.println("Largest number: " + String.join("", numbers));
        scanner.close();
    }
}
