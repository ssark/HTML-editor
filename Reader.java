import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Sanjana
 *
 * Methods to read file with HTML code, and set to text area
 *
 */

public class Reader {
	
	private static BufferedReader r;
	public static String line;
	
	public Reader(File file) {
		try {
			r = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static String getCode() {
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
	
	public static void setTextArea() {
		
	}
}
