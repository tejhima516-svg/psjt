import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter first date (dd-MM-yyyy): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Enter second date (dd-MM-yyyy): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine(), formatter);

        long days = Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate));
        System.out.println("Number of days: " + days);
        scanner.close();
    }
}
