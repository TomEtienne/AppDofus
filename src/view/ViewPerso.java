package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Personnage;

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
					case ENIRIPSA:
						r.add(new JLabel(new ImageIcon("resources/eniripsa.png")));
						break;
					case IOP:
						r.add(new JLabel(new ImageIcon("resources/iop.png")));
						break;
					case CRA:
						r.add(new JLabel(new ImageIcon("resources/cra.png")));
						break;
					case FECA:
						r.add(new JLabel(new ImageIcon("resources/feca.png")));
						break;
					case SACRIEUR:
						r.add(new JLabel(new ImageIcon("resources/sacrieur.png")));
						break;
					case SADIDA:
						r.add(new JLabel(new ImageIcon("resources/sadida.png")));
						break;
					case OSAMODAS:
						r.add(new JLabel(new ImageIcon("resources/osamodas.png")));
						break;
					case ENUTROF:
						r.add(new JLabel(new ImageIcon("resources/enutrof.png")));
						break;
					case SRAM:
						r.add(new JLabel(new ImageIcon("resources/sram.png")));
						break;
					case XELOR:
						r.add(new JLabel(new ImageIcon("resources/xelor.png")));
						break;
					case PANDAWA:
						r.add(new JLabel(new ImageIcon("resources/pandawa.png")));
						break;
					case ROUBLARD:
						r.add(new JLabel(new ImageIcon("resources/roublard.png")));
						break;
					case ZOBAL:
						r.add(new JLabel(new ImageIcon("resources/zobal.png")));
						break;
					case STEAMER:
						r.add(new JLabel(new ImageIcon("resources/steamer.png")));
						break;
					case ELIOTROPE:
						r.add(new JLabel(new ImageIcon("resources/eliotrope.png")));
						break;
					case HUPPERMAGE:
						r.add(new JLabel(new ImageIcon("resources/huppermage.png")));
						break;
					case OUGINAK:
						r.add(new JLabel(new ImageIcon("resources/ouginak.png")));
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
