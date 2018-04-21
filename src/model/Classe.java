package model;

public enum Classe {
	ECAFLIP("Ecaflip"),
	ENIRIPSA("Eniripsa"),
	IOP("Iop"),
	CRA("Cra"),
	FECA("Feca"),
	SACRIEUR("Sacrieur"),
	SADIDA("Sadida"),
	OSAMODAS("Osamodas"),
	ENUTROF("Enutrof"),
	SRAM("Sram"),
	XELOR("Xelor"),
	PANDAWA("Pandawa"),
	ROUBLARD("Roublard"),
	ZOBAL("Zobal"),
	STEAMER("Steamer"),
	ELIOTROPE("Eliotrope"),
	HUPPERMAGE("Huppermage"),
	OUGINAK("Ouginak");
	
	private final String classe;
	
	private Classe(final String classe) {
		this.classe = classe;
	}
	
	public String getClasse() {
		return classe;
	}
}
