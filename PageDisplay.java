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
	
	public PageDisplay(File file) {
		updateFile(file);
		setEditable(false);	// so that no weird things appear on the screen (set to true to see a funny html page)
		display();
	}
	
	public void updateFile(File file) {
		this.file = file;
	}
	
	public void display() {
		try {
			setPage(file.toURI().toURL());
		}catch (IOException e) {
			setContentType("text/html");
			setText("<html>Could not load</html>");
		}
	}
}
