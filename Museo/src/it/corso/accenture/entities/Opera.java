package it.corso.accenture.entities;





public class Opera  {
	private int codice;
	private String titolo;
	private String autore;
	public Opera(int cod, String tit, String aut) {
		this.codice=cod;
		this.titolo=tit;
		this.autore=aut;
		
		// TODO Auto-generated constructor stub
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
}
