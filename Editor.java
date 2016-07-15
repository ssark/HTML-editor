import javax.swing.JEditorPane;

/**
 * 
 * @author Victoria
 *
 * Editor where source code is loaded and edited
 *
 */

@SuppressWarnings("serial")
public class Editor extends JEditorPane {
	private String code;
	
	public Editor() {
		setEditable(false);
	}
	
	/**
	 * Sets new code to be displayed
	 * @param file	new code to be displayed
	 */
	public void updateCode(String code) {
		this.code = code;
		setEditable(true);
		display();
	}
	
	/**
	 * Displays HTML page or gives error screen if file cannot be loaded
	 * Prompts to choose a file if file is null
	 */
	public void display() {
		setText(code);
	}
}
