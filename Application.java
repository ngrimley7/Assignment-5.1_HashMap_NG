import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        // Load the dictionary from the file
        dictionary.loadDictionary("Untitled 1.txt");

        System.out.println("Dictionary App");
        System.out.println("Type a word to get its definition or 'exit' to stop.");

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if ("exit".equalsIgnoreCase(word)) {
                break;
            }

            String definition = dictionary.getDefinition(word);
            if (definition != null) {
                System.out.println(word + ": " + definition);
            } else {
                System.out.println("Word not found.");
            }
        }

        scanner.close();    }
}
