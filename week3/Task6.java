import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter names:");
        for (int index = 0; index < count; index++) {
            names.add(scanner.nextLine());
        }

        System.out.println("Names in the list:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
