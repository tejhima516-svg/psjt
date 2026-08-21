import java.util.PriorityQueue;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        System.out.print("Enter number of elements: ");
        int count = scanner.nextInt();
        System.out.println("Enter elements:");
        for (int index = 0; index < count; index++) {
            queue.add(scanner.nextInt());
        }

        System.out.println("Elements in priority order:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        scanner.close();
    }
}
