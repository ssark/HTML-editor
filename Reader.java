import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Sanjana, Victoria
 *
 * Methods to read file with HTML code, and set to text area
 *
 */

public class Reader {
	
	private BufferedReader r;
	private String line;
	
	public Reader(File file) {
		try {
			r = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException | NullPointerException e) {
			System.out.println("Nothing was loaded");
		}
	}
	
	public String getCode() {
		String result = "";
		try {
			while((line = r.readLine()) != null) {
				result += line + "\n";
			}
		} catch (IOException e) {
			
		} finally {
			return result;
		}
	}
	
	public void updateCode(File file) {
		try {
			r = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("Could not load");
		}
	}
	
	public static void setTextArea() {
		
	}
}
