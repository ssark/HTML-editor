import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class DisplayWindow {
	
	public static void main(String[] args) {
		/**
		JEditorPane editor = new JEditorPane(); // the thing that the HTML file appears in
		editor.setEditable(false);				// so that no weird things appear on the screen (set to true to see a funny html page)
		
		try {
			editor.setPage("http://www.google.com"); // remove later - html of website we want to see
		}catch (IOException e) {
			editor.setContentType("text/html");
			editor.setText("<html>Could not load</html>");
		}**/
		
		/**
		 * regular GUI stuff to make the things appear on the screen
		 * 
		 */
		
		PageDisplay HTMLPage = new PageDisplay(null); // to change with loaded file
		
		JScrollPane scrollPane = new JScrollPane(HTMLPage);
		scrollPane.setPreferredSize(new Dimension(800, 600));
		JFrame frame = new JFrame("HTML Editor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(scrollPane);
		frame.setPreferredSize(new Dimension(800,600));
		frame.pack();
		frame.setVisible(true);
	}

}
