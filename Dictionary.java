/**
 * @author Niall Grimley
 * @version 11/17/2023
 * Class uses a text file to grab words and definitions and gives them a hashcode by scanning the imported file
 * 
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;

public class Dictionary 
{
	
	/** 
	 * methods
	 * creates the hashmap for the dictionary, taking in 2 strings, word and definition
	 */
	HashMap<String, String> dictionary = new HashMap<String, String>();
	Scanner scan;
	String key;
	String value;
	
	
	/**
	 * Scans Untitled 1, which contains the entirety of the dictionary
	 */
	public void scanFile() 
	{
		try 
		{
			File dictionaryDefinitions = new File("Untitled 1.txt"); 
			scan = new Scanner(dictionaryDefinitions);
		}
		catch(FileNotFoundException error) {
			System.out.println("Error, no file");
		}
	}
	
	/**
	 * Takes the text and turns it into the hashkey and grabbing its definition, puts the words into the hashmap and printing the values
	 */
	public void hashFile() 
	{
		int num = 0;
		
		while(scan.hasNext()) 
		{
			num++;
			
			String word = scan.nextLine();
			
			int delimiter = word.indexOf("\t");
			
			if(delimiter!=-1) 
			{
				key = word.substring(0, delimiter);
				value = word.substring(delimiter+1, word.length());
				dictionary.put(key, value);
			}
		}
		
		System.out.println("There are " + num + " unique words and definitions in the dictionary");
		
		System.out.println(dictionary);
		
	}
	
	/**
	 * Uses the get method to find the word and definition in the dictionary, and gives it a hash code.
	 */
	public void getWord() 
	{ 
		System.out.println("Sooth: " + dictionary.get("sooth") + ". Hashkey: " + "sooth".hashCode());
		System.out.println("Methinks: " + dictionary.get("methinks") + ". Hashkey: " + "methinks".hashCode());
		System.out.println("Inscribe: " + dictionary.get("inscribe") + ". Hashkey: " + "inscribe".hashCode());
		System.out.println("Gadzooks: " + dictionary.get("gadzooks") + ". Hashkey: " + "gadzooks".hashCode());
		System.out.println("Cutpurse: " + dictionary.get("cutpurse") + ". Hashkey: " + "cutpurse".hashCode());
	}
	
}//end class