import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        Map<Character, Integer> frequency = new HashMap<>();
        for (char character : text.toCharArray()) {
            if (character != ' ') {
                frequency.put(character, frequency.getOrDefault(character, 0) + 1);
            }
        }

        ArrayList<Character> characters = new ArrayList<>(frequency.keySet());
        characters.sort(Comparator.comparingInt(frequency::get).reversed());
        for (char character : characters) {
            for (int count = 0; count < frequency.get(character); count++) {
                System.out.print(character);
            }
        }
        scanner.close();
    }
}
