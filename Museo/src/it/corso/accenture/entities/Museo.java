package it.corso.accenture.entities;

import java.util.ArrayList;
import java.util.List;


public class Museo {
	private List<Opera> depositi = new ArrayList<Opera>();
	private List<Quadro>quadri= new ArrayList<Quadro>();
	private List<Opera> esposti = new ArrayList<Opera>();
	private List<Statua>statue= new ArrayList<Statua>();

	private static int numPostiMax;
	private int numPostiCorr;

	public Museo() {
		this.numPostiMax = 5;
		this.numPostiCorr = 0;
		// TODO Auto-generated constructor stub
	}

	/*
	 * carica(Operaopera ): void questo metodo deve verificare se c’è posto nel
	 * museo, nel caso mette lo stato dell’opera ad esposta , viceversa pone l’opera
	 * indeposito (e dunque risulterà non esposta)
	 */
	public void carica(Opera opera) {
		if (this.numPostiCorr < this.numPostiMax) {
			esposti.add(opera);
			
			System.out.println("Opera: " + opera.getTitolo() + " Autore: " + opera.getAutore() + " IN ESPOSIZIONE");
			this.numPostiCorr++;
		} else {
			depositi.add(opera);
			System.out.println("Opera: " + opera.getTitolo() + " Autore: " + opera.getAutore() + " IN DEPOSITO");

		}
	}

	/*
	 * 
	 * sposta(int codice): Opera sposta l’opera dalle sale del museo nel deposito
	 */
	public Opera sposta(int codice) {
		Opera opera = null;
		if (this.esposti.size() >= 1) {

			for (Opera op : this.esposti) {
				if (op.getCodice() == codice) {

					this.depositi.add(op);
					opera = op;
					this.esposti.remove(op);
					break;
				}
			}
		} else {
			System.out.println("Nessuna opera esposta.");
		}
		return opera;

	}

	/*
	 * cerca(int codice) : Opera cerca l’opera per codice (sia museo che nel
	 * deposito)
	 */
	
	public Opera cerca(int codice) {
		Opera opera = null;
		if (this.esposti.size() >= 1) {

			for (Opera op : this.esposti) {
				if (op.getCodice() == codice) {

					opera =op;
				}
			}
		} else {
			System.out.println("Nessuna opera da cercare.");
		}
		return opera;

	}
	/*stampaSala (): String
	stampaDeposito (): String
	*/
	public void stampaSala() {
		for(Opera op: this.esposti) {
			System.out.println("Codice: "+op.getCodice()+" Autore: "+op.getAutore()+" Titolo: "+op.getTitolo());
		}
		
	}
	public void stampaDeposito() {
		for(Opera op: this.depositi) {
			System.out.println("Codice: "+op.getCodice()+" Autore: "+op.getAutore()+" Titolo: "+op.getTitolo());

		}
		
	}
	public static int getNumPostiMax() {
		return numPostiMax;
	}

	public static void setNumPostiMax(int numPostiMax) {
		Museo.numPostiMax = numPostiMax;
	}

	public int getNumPostiCorr() {
		return numPostiCorr;
	}

	public void setNumPostiCorr(int numPostiCorr) {
		this.numPostiCorr = numPostiCorr;
	}

}
