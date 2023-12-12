/**
 * @author Niall Grimley
 * @version 11/17/2023
 * Class uses a text file to grab words and definitions and gives them a hashcode by scanning the imported file
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void loadDictionary(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t", 2);
                if (parts.length == 2) {
                    String word = parts[0].trim();
                    String definition = parts[1].trim();
                    dictionary.put(word, definition);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The dictionary file was not found.");
        }
    }

    public String getDefinition(String word) {
        return dictionary.get(word);
    }
} 