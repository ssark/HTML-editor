import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
		
		// control panel or toolbar
		final JPanel control_panel = new JPanel();
        frame.add(control_panel, BorderLayout.NORTH);
        
        final JButton load = new JButton("Load");
        load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileTools.loadFile();
            }
        });
        final JButton newFile = new JButton("New");
        load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileTools.newFile();
            }
        });
        final JButton save = new JButton("Save");
        load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileTools.saveFile();
            }
        });
        control_panel.add(load);
        control_panel.add(newFile);
        control_panel.add(save);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(scrollPane);
		frame.setPreferredSize(new Dimension(800,600));
		frame.pack();
		frame.setVisible(true);
	}

}
