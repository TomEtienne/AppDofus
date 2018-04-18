package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Personnage;

public class AppView {
	
	// Frame
	private JFrame frame;
	
	// Model
	private Personnage model;

	public AppView() {
		createModel();
		createView();
		placeComponents();
		createController();
	}
	
	public void display() {
		refresh();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private void createModel() {
		model = new Personnage();
	}
	
	private void createView() {
		frame = new JFrame("App Dofus");
	}
	
	private void placeComponents() {
		JPanel p = new JPanel(new BorderLayout()); {
			
		}
		frame.add(p, BorderLayout.NORTH);
	}
	
	private void createController() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void refresh() {
		
    }
	
}
