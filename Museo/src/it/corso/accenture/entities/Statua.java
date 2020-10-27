package it.corso.accenture.entities;

public class Statua extends Opera{
	private String materiale;
	private String altezza;
	public Statua(int cod, String tit, String aut, String mat, String alt) {
		super(cod,tit,aut);
		this.materiale=mat;
		this.altezza= alt;
		// TODO Auto-generated constructor stub
	}
	public String getMateriale() {
		return materiale;
	}
	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	public String getAltezza() {
		return altezza;
	}
	public void setAltezza(String altezza) {
		this.altezza = altezza;
	}

}
