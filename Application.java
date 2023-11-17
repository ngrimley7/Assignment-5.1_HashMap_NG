/**
 * @author Niall Grimley
 * @version 11/17/2023
 * Application to scan and hash a dictionary to search for the definition and the hashkey
 */
public class Application 
{
	
	public static void main(String[] args) 
	{
		
		Dictionary dictionary = new Dictionary();
		//prints entirety of the dictionary from Untitled 3
		dictionary.scanFile(); 
		//You have to scan the file first, hashing it will return an error
		
		//finds all entries of the dictionary from Untitled 3
		dictionary.hashFile();
		
		System.out.println("\nWords, Definitions, and Hashkeys:\n");
		
		//gets the inputed words gathered from Untitled 1
		dictionary.getWord();
		
	}//end main

}//end class
