package it.corso.accenture.entities;

public class Quadro extends Opera {
	
	private String tecnica;
	
		
	
	public Quadro(int cod, String tit, String aut, String tec) {
		super(cod,tit,aut);
		this.tecnica=tec;
	}
	
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

}
