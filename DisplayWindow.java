import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class DisplayWindow {
	
	public static void main(String[] args) {
		JEditorPane editor = new JEditorPane();
		editor.setEditable(false);   
		
		try {
			//File file = new File("C://Users//Victoria//Documents//brookhaven//home.php");
			//jep.setPage(file.toURI().toURL());
			editor.setPage("http://www.google.com");
		}catch (IOException e) {
			editor.setContentType("text/html");
			editor.setText("<html>Could not load</html>");
		} 
		
		JScrollPane scrollPane = new JScrollPane(editor);
		scrollPane.setPreferredSize(new Dimension(800, 600));
		JFrame frame = new JFrame("HTML Editor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(scrollPane);
		frame.setPreferredSize(new Dimension(800,600));
		frame.pack();
		frame.setVisible(true);
	}

}
