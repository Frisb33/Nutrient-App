package model;

import javax.swing.SwingUtilities;

import view.LoginPage;

public class MainApplication {
	
	public MainApplication() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				LoginPage l = new LoginPage();
			}
		});
	}
}
