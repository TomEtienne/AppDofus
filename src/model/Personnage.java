package model;

public class Personnage {
	
	// Infos Personnage
	private Classe classe;
	private String nom;
	private int pdv;
	private int pointsActions;
	private int pointsMouvements;
	private int niveau;
	private int initiative;
	
	// Infos Caracteristiques
	private int resiNeutre;
	private int resiForce;
	private int resiIntelligence;	
	private int resiChance;
	private int resiAgilite;
	
	public Personnage(Classe classe,String nom, int pdv, int pointsActions, int pointsMouvements,
			int niveau, int initiative, int resiNeutre, int resiForce,
			int resiIntelligence, int resiChance, int resiAgilite) {
		this.classe = classe;
		this.nom = nom;
		this.pdv = pdv;
		this.pointsActions = pointsActions;
		this.pointsMouvements = pointsMouvements;
		this.niveau = niveau;
		this.initiative = initiative;
		this.resiNeutre = resiNeutre;
		this.resiForce = resiForce;
		this.resiIntelligence = resiIntelligence;
		this.resiChance = resiChance;
		this.resiAgilite = resiAgilite;
	}
	
	public Personnage() {
		this.classe = null;
		this.nom = null;
		this.pdv = 0;
		this.pointsActions = 0;
		this.pointsMouvements = 0;
		this.niveau = 0;
		this.initiative = 0;
		this.resiNeutre = 0;
		this.resiForce = 0;
		this.resiIntelligence = 0;
		this.resiChance = 0;
		this.resiAgilite = 0;
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPdv() {
		return pdv;
	}

	public void setPdv(int pdv) {
		this.pdv = pdv;
	}

	public int getPointsActions() {
		return pointsActions;
	}

	public void setPointsActions(int pointsActions) {
		this.pointsActions = pointsActions;
	}

	public int getPointsMouvements() {
		return pointsMouvements;
	}

	public void setPointsMouvements(int pointsMouvements) {
		this.pointsMouvements = pointsMouvements;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public int getResiNeutre() {
		return resiNeutre;
	}

	public void setResiNeutre(int resiNeutre) {
		this.resiNeutre = resiNeutre;
	}

	public int getResiForce() {
		return resiForce;
	}

	public void setResiForce(int resiForce) {
		this.resiForce = resiForce;
	}

	public int getResiIntelligence() {
		return resiIntelligence;
	}

	public void setResiIntelligence(int resiIntelligence) {
		this.resiIntelligence = resiIntelligence;
	}
	
	public int getResiChance() {
		return resiChance;
	}

	public void setResiChance(int resiChance) {
		this.resiChance = resiChance;
	}

	public int getResiAgilite() {
		return resiAgilite;
	}

	public void setResiAgilite(int resiAgilite) {
		this.resiAgilite = resiAgilite;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", pdv=" + pdv + ", pointsActions=" + pointsActions + ", pointsMouvements="
				+ pointsMouvements + ", niveau=" + niveau + ", initiative=" + initiative + ", resiNeutre=" + resiNeutre
				+ ", resiForce=" + resiForce + ", resiIntelligence=" + resiIntelligence + ", resiChance=" + resiChance
				+ ", resiAgilite=" + resiAgilite + "]";
	}
}