package it.corso.accenture.test;

import java.util.Scanner;

import it.corso.accenture.entities.Museo;
import it.corso.accenture.entities.Opera;
import it.corso.accenture.entities.Quadro;
import it.corso.accenture.entities.Statua;

public class Test {
	/*
	 * Scrivere un programma che consenta la gestione delle opere di un museo. Le
	 * opere possono essere: Quadri Statue
	 * 
	 * 
	 * 
	 * Un’opera è sempre in uno di questi 2 stati: Esposta Non esposta, cioè è in
	 * deposito Le funzionalità da implementare sono: carica(Operaopera ): void
	 * questo metodo deve verificare se c’è posto nel museo, nel caso mette lo stato
	 * dell’opera ad esposta , viceversa pone l’opera indeposito (e dunque risulterà
	 * non esposta)
	 * 
	 * sposta(int codice): Opera sposta l’opera dalle sale del museo nel deposito
	 * 
	 * cerca(int codice) : Opera cerca l’opera per codice (sia museo che nel
	 * deposito) stampaSala (): String stampaDeposito (): String
	 */
	public static void main(String[] args) {
		Museo museo = new Museo();
		boolean a = false;
		int i = 0;

		do {
			int cod = 0;
			System.out.println(
					"MUSEO \n 1.CARICA QUADRO \n 2.CARICA STATUA \n 3.SPOSTA IN DEPOSITO \n 4.CERCA OPERA IN DEPOSITO O IN ESPOSIZIONE \n 5.VISUALIZZA SALA ESPOSIZIONI \n 6.VISUALIZZA DEPOSITO \n 7.ESCI \n");
			Scanner sc = new Scanner(System.in);
			String scelta = sc.nextLine();
			switch (scelta) {
			case "1":
				i++;
				System.out.println("Inserisci titolo: ");
				String tit= sc.nextLine();
				System.out.println("Inserisci autore: ");
				String aut = sc.nextLine();
				System.out.println("Inserisci tecnica: ");
				String mod= sc.nextLine();
				
				Quadro quadro = new Quadro(i, tit, aut, mod);
				museo.carica(quadro);
				a = true;
				break;
			case "2":
				Statua statua = new Statua(2, "il David", "Donatello", "Marmo", "3 metri");
				museo.carica(statua);
				a = true;
				break;
			case "3":
				System.out.println("Inserisci il codice dell'opera da spostare: ");
				cod = sc.nextInt();
				Opera opera = museo.sposta(cod);
				if (opera != null) {
					System.out.println("Codice: " + opera.getCodice() + " Autore: " + opera.getAutore() + " Titolo: "
							+ opera.getTitolo() + "\n E'stata spostata in deposito.");
				}
				a = true;
				break;
			case "4":
				System.out.println("Inserisci il codice dell'opera da spostare: ");
				cod = sc.nextInt();
				Opera op = museo.cerca(cod);
				if (op != null) {
				System.out.println("Codice: "+op.getCodice()+"\n Autore: "+op.getAutore()+"\nTitolo: "+op.getTitolo()+"\n E'stata spostata in deposito.");
				}
				a = true;
				break;
			case "5":
				museo.stampaSala();
				a= true;
				break;
			case "6":
				museo.stampaDeposito();
				a= true;
				break;
			case "7":
				System.out.println("Arrivederci");
				a = false;
				break;
				
			default:
				System.out.println("RITENTA");
				a = true;

			}
		} while (a != false);
	}
}
