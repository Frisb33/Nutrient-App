package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Dashboard extends JFrame{
	
	public Dashboard() {  
		initializeUI();
    }
	
	private void initializeUI() {
		// Set up the frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setTitle("Dashboard");
        setLocationRelativeTo(null);
        
        // Set the layout for the main panel
        setLayout(new GridLayout(0, 1));

        // Add a label to the dashboard
        JLabel label = new JLabel("Dashboard");
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        //buttons added
        addButton("Meal Logging", e -> openMealLoggingPage());
        addButton("Exercise Logging", e -> openExerciseLoggingPage());

        //Make dashboard visible
        setVisible(true);
    }

    private void addButton(String buttonText, ActionListener actionListener) {
        JButton button = new JButton(buttonText);
        button.addActionListener(actionListener);
        add(button);
    }

    private void openMealLoggingPage() {
        System.out.println("Opening Meal Logging Page");
    }

    private void openExerciseLoggingPage() {
    	System.out.println("Opening Exercise Logging Page");
    	
    }
	
}
