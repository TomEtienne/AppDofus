package model;

public class Personnage {
	
	// Infos Personnage
	private String nom;
	private int pdv;
	private int pointsActions;
	private int pointsMouvements;
	private int niveau;
	private int initiative;
	
	// Infos Caractéristiques
	private int vitalite;
	private int agilite;
	private int chance;
	private int force;
	private int intelligence;	
	private int sagesse;
	
	public Personnage(String nom, int pdv, int pointsActions, int pointsMouvements,
			int niveau, int initiative, int vitalite, int agilite, int chance,
			int force, int intelligence, int sagesse) {
		this.nom = nom;
		this.pdv = pdv;
		this.pointsActions = pointsActions;
		this.pointsMouvements = pointsMouvements;
		this.niveau = niveau;
		this.initiative = initiative;
		this.vitalite = vitalite;
		this.agilite = agilite;
		this.chance = chance;
		this.force = force;
		this.intelligence = intelligence;
		this.sagesse = sagesse;
	}
	
	public Personnage() {
		this.nom = null;
		this.pdv = 0;
		this.pointsActions = 0;
		this.pointsMouvements = 0;
		this.niveau = 0;
		this.initiative = 0;
		this.vitalite = 0;
		this.chance = 0;
		this.force = 0;
		this.intelligence = 0;
		this.sagesse = 0;
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

	public int getVitalite() {
		return vitalite;
	}

	public void setVitalite(int vitalite) {
		this.vitalite = vitalite;
	}

	public int getAgilite() {
		return agilite;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getSagesse() {
		return sagesse;
	}

	public void setSagesse(int sagesse) {
		this.sagesse = sagesse;
	}
	
	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", pdv=" + pdv + ", pointsActions=" + pointsActions + ", pointsMouvements="
				+ pointsMouvements + ", niveau=" + niveau + ", initiative=" + initiative + ", vitalite=" + vitalite
				+ ", agilite=" + agilite + ", chance=" + chance + ", force=" + force + ", intelligence=" + intelligence
				+ ", sagesse=" + sagesse + "]";
	}

}
