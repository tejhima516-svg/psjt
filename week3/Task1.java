import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input, formatter);

        System.out.println("Date: " + date.format(formatter));
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());
        scanner.close();
    }
}
