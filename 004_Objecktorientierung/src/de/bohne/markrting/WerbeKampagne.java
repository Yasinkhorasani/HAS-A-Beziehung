package de.bohne.markrting;

import de.bohne.personen.Kunde;

/**
 * Demonstration eine Betzihong zwichen Klassen: HAS-A-Beziehung. Eine klasse
 * hat atribute von Type andere (eventuell selbs geshriebene)Klassse Hie: die
 * Klasse Werbekampagne hat Atributre vom Type Kunde
 * 
 * "Blich aus dem Fenster" Bald startet Oktoberfest. Deshalb werdenausgewählte
 * kunden informieren, die Werbung zugestimmt haben. dass, zu jedem weißen
 * Milchcoffe einen blauen keks gibt Diese Kampagne dauert 10 tage lang, und hat
 * ein titel: BLau-Weiße wie die himmel übe fest jede Kunde wird die name
 * angeschprochen und bekommt informatiom zur Kampagne (Hier: System.out...
 * später zB über email, Werbeanrufe, Postkarten...)
 * 
 * Atributet: Werbetext, Werbetittel, Dauer, ausgewählte Kunden werbeText:
 * String Werbetitel: Strin dauer: int diKunden: Kunde[]
 * 
 * Metoden: Benachrichtigen der Kunden, verschicken des Emails, starten der
 * Kampaagne
 * 
 * @author Yasin
 *
 */
public class WerbeKampagne {
	// ******************Atribute*********************
	/**
	 * Enthält information über die Beworbenen falls gewüncht über neue Preise
	 */
	private String werbeText;
	//vorintialisiert mit null
	/** * titel der webekampagne */
	private String titel;
	//vorintialisiert mit null
	/*** dauer in Tagen */
	private int dauer;
	//vorintialisiert mit 0
	/**
	 * Die kunden dieser kampagne werden von der marketingabteilung identifiziert
	 * Hier: der new-Aufruf das Array wird nicht Klasse Werbekampagne durchgeführt
	 * sondern das Array über set-methode in ein Object om Type Werbekampagne
	 * eingeführt. In dem Array befinden sich, die Kunden , dei werbunung zugestimmt
	 * haben und die , die Werbung abgelehnt haben.
	 */
	private Kunde[] dieKunden;
	////vorintialisiert mit null

	// ******************Methoden*************************
	/**
	 * Alle Kunden werden Kontroliert: Haben sie Werbung zugestimmt die, die
	 * zugestimmmt haben bekommen die info, zusammengesetz aus Titel, text und Dauer
	 * UND die info wird personalisiert: Der Kunde wird mit dNamen angesprochen
	 * kontrolle: wurde das-Kundennarray gefüllt? dazu vergleich mit null
	 */
	public void informierenDerKunden() {
		if(dieKunden == null) {
			System.err.println("---- Bitte erst die kunden festlegen");
			return;
			//return beendet die methode
		}
		if(titel ==null) {
			System.out.println("bitte tittel festlegen");
			return;
		}
		if(dauer == 0) {
			System.out.println(" Bitte dauer festlegen");
			return;
		}
		if(werbeText ==null) {
			System.out.println("bitte werbetextfestlegen");
			return;
		}
		for (int i = 0; i < dieKunden.length; i++) {
			Kunde kunde = dieKunden[i];
			if( kunde == null) {
				//Wunsch: i hochzählen und ob das nächste array-ellement ein kunde existiert oder leher ist
				continue;
				//setz die Schleife am Schleifekopf fort(hier: i hochzählem und vergleichen)
			}
			if (kunde.isWerbungErlaubt()) {
				String anzeigetext = "\n\tWichtige Info";
				if(kunde.getName() != null) {
				anzeigetext = anzeigetext + "\nLiebe/r" + kunde.getName() + "," + titel;
				}else {anzeigetext = anzeigetext + "\n"+ titel;
				}
				anzeigetext += "\nFür die nächsten" + dauer + "Tage gilt";
				
				anzeigetext += "\n" + werbeText;
				System.out.println(anzeigetext);
			} else {
				System.out.println("-----kunde will keine Werbung: " + kunde);
			}
		}

	}

	// ************************************GETTER/SETTER*****************
	/**
	 * legt der dauer der Kampagne fest
	 * @param diedauer in Tagen
	 */
	public void setDauer(int diedauer) {
		dauer = diedauer; 
	}
	
	public void setTitel (String derTitel) {
		titel = derTitel;
	}
	
	public void setWerbetext( String derWerbetext) {
		werbeText = derWerbetext;
	}
	
	/**
	 * wird in der Marketingabeilung erstellt. Hier: in der main
	 * @param ausgewaelteKunden
	 */
	public void setDieKunden(Kunde[] ausgewaelteKunden) {
		dieKunden = ausgewaelteKunden;
	}
}
/*
* Bearbeiten des letzten Projekts: Objekte/Klasse testen
* Erweitern der Klassen/ neue Klassen erstellen: HAS-A-Beziehungen einbauen
* Beispiel: Tier hat einen Schlafplatz, der hat ein Zimmer
* Beispiel: Koch hat viele Messer mit unterschiedlichen Klingenformen
* Beispiel: Nachbarin hat Wischroboter
* ...
*/
