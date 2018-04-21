package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Personnage;
import sun.applet.Main;

public class ViewPerso extends JPanel {
	
	private Personnage model;
	
	public ViewPerso(Personnage model) {
		this.model = model;
		
		JPanel p = new JPanel(new BorderLayout()); {
			JPanel q = new JPanel(new BorderLayout()); {
				JPanel r = new JPanel(); {
					switch (model.getClasse()) {
					case ECAFLIP:
						r.add(new JLabel(new ImageIcon("resources/ecaflip.png")));
						break;

					default:
						break;
					}
				}
				q.add(r, BorderLayout.WEST);
				
				// Infos Pratiques persos
				r = new JPanel(); {
					r.add(new JLabel("Nom : " + model.getNom()));
					r.add(new JLabel("Niveau : " + model.getNiveau()));
				}
				q.add(r, BorderLayout.NORTH);
				r = new JPanel(); {
					r.add(new JLabel("Points d'actions : " + model.getPointsActions()));
					r.add(new JLabel("Points de mouvements : " + model.getPointsMouvements()));
				}
				q.add(r, BorderLayout.CENTER);
				r = new JPanel(); {
					r.add(new JLabel("Points de vie : " + model.getPdv()));
					r.add(new JLabel("Initiative : " + model.getInitiative()));
				}
				q.add(r, BorderLayout.SOUTH);
			}
			p.add(q, BorderLayout.NORTH);
			
			// Infos Resistances Persos
			q = new JPanel(new GridLayout(0,5)); {
				q.add(new JLabel("Resis Neutre : " + model.getResiNeutre()));
				q.add(new JLabel("Resis Force : " + model.getResiForce()));
				q.add(new JLabel("Resis Intelligence : " + model.getResiIntelligence()));
				q.add(new JLabel("Resis Chance : " + model.getResiChance()));
				q.add(new JLabel("Resis Agilite : " + model.getResiAgilite()));
			}
			p.add(q, BorderLayout.CENTER);
			
		}
		add(p, BorderLayout.CENTER);
	}
	
	public Personnage getModel() {
		return this.model;
	}
	
}
