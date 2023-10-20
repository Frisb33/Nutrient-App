package view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPage extends JFrame{
	public LoginPage() {
		userInterface();
	}
	
	public void userInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		content();
	}
	
	public void content() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));
		
		//login prompt
		JLabel label = new JLabel("Log In");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		 // Add the label to the panel
	    panel.add(label);
	    
	    // Add the panel to the frame
	    add(panel);
	    
	    // Make sure to validate and repaint the frame
	    validate();
	    repaint();

	}
}
