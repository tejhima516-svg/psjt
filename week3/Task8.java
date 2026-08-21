import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of values: ");
        int count = scanner.nextInt();
        System.out.println("Enter values:");
        for (int index = 0; index < count; index++) {
            numbers.add(scanner.nextInt());
        }

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Sorted values: " + numbers);
        scanner.close();
    }
}
