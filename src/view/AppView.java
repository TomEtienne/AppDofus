package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import model.Classe;
import model.Personnage;

public class AppView {
	
	// Frame
	private JFrame frame;
	private ViewPerso viewPerso;
	
	// Components
	private JTextField searchField;
	private JButton search;
	
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
		// model = new Personnage();
		model = new Personnage(Classe.ECAFLIP,"Tom", 3000, 12, 6, 200, 2000, 5, 6, 7, 8, 9);
		//model = null;
	}
	
	private void createView() {
		// Frame settings
		frame = new JFrame("App Dofus");
		frame.setPreferredSize(new Dimension(600,400));
		
		// Model Settings
		if(model != null) {
			viewPerso = new ViewPerso(model);
		}
		
		// Components settings
		searchField = new JTextField(15);
		search = new JButton("Search !");
	}
	
	private void placeComponents() {
		JPanel p = new JPanel(new BorderLayout()); {
			JPanel q = new JPanel(); {
				q.add(searchField);
				q.add(search);
			}
			p.add(q);
		}
		frame.add(p, BorderLayout.NORTH);
		
		if(model != null) {
			frame.add(viewPerso, BorderLayout.CENTER);
		}
	}
	
	private void createController() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void refresh() {
		
    }
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AppView().display();
			}
		});
	}
	
}
