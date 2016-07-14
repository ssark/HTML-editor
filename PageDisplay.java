import java.io.File;
import java.io.IOException;

import javax.swing.JEditorPane;

/**
 * 
 * @author Victoria
 *
 * JEditorPane that displays loaded HTML Page
 *
 */

@SuppressWarnings("serial")
public class PageDisplay extends JEditorPane {
	private File file;
	
	/**
	 * Set and display HTML page
	 * 
	 * @param file	page to be loaded
	 */
	public PageDisplay(File file) {
		updateFile(file);
		setEditable(false);	// so that no weird things appear on the screen (set to true to see a funny html page)
		display();
	}
	
	/**
	 * Sets new page to be displayed
	 * @param file	new page to be displayed
	 */
	public void updateFile(File file) {
		this.file = file;
	}
	
	/**
	 * Displays HTML page or gives error screen if file cannot be loaded
	 * Prompts to choose a file if file is null
	 */
	public void display() {
		if (file == null) {
			setContentType("text/html");
			setText("<html><h1>Please select a HTML file to load<h1></html>");
			return;
		}
		try {
			setPage(file.toURI().toURL());
		}catch (IOException e) {
			setContentType("text/html");
			setText("<html><h1>Error!<h1><h2>Page could not load<h2></html>");
		}
	}
}
