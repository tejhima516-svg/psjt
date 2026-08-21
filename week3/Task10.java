import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter values:");
        for (int index = 0; index < count; index++) {
            numbers[index] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sorted values: " + Arrays.toString(numbers));
        scanner.close();
    }
}
