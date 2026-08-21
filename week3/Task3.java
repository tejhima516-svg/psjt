import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter date (dd-MM-yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("Day of year: " + date.getDayOfYear());
        scanner.close();
    }
}
