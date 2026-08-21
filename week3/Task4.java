import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter date (dd-MM-yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("Day of week: " + date.getDayOfWeek());
        scanner.close();
    }
}
