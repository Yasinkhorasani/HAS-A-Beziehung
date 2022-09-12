package de.bohne.personen;

/**
 *  Vorlage für Kunden-objekte.
 *  Abstraktion einer Person die kauft und bezahlt.
 *  
 *  "Blick aus dem Fenster": Objecktbeschreibung.
 *  Ein Kunde betritt das Cafa':
 *  Der Kunde heißt Justus Junas
 *  der kunde hat eine rechnungshöhe von 11.99;
 *  Der kunde hat zugeeschtimmt ewerbung von uns zu bekommen
 *  
 *  jonas bestellt etwas für ein Euro( rechnungshöhe endert sich auf 12.99)
 *  der bezahlt(rechnungshöhe endert sich auf 0)
 *  der ändert seine Einstellung zu Werbung(er lehnt ab, webung zu bekommen)
 *  
 *  Abstraktion der kundenklasse(kundenbeschreibung)
 *    ein kunde HAT   Naame,  einstellung zur Werbung,  rechnungshöhe.
 *    Ein kunde KANN   bestellen,   bezahlen,   seine einstellung zu Werbung ändern
 *    
 * "HAT":  Eigenschaft/ AtributtT/ Feld
 * "KAN": Fähigkeiten/ Verhalten/ Methoden
 * 
 *    Atribute: Sind Variablen aus er Datentypen und Bezeichner
 *              Atribute sind vorinitialiesiert: 0, 0, false, null
 *    Fähigkeiten/Methoden: ändern möglicherweise den Zustand der Atribute
 *    
 *    Grundprinzipien der Objectorientierung: 
 *       Abstraktion, Datenkapsselung, vererbung, Polymorphismus        
 *       
 *  Class: 1.Aufgabe: vorlage /Template für ein Object
 *  	   2.Aufgabe: datentype für ReferenZen	 
 *  
 *        Datenkapsellung: private ( Alle Atributte ein klasse sind private)
 *        private: diese variabel_bezeichner ist nur innerhalb der Klasse sichtbar
 *        
 * @author Yasin
 *
 */
public class Kunde {
//*************************************************************	
//***Atribute
	//*********************************************************
	/**
	 * Enthält vollständigen Kundennamen
	 */
	private String name;
	/**
	 * Enthält den Betrag, den kunde zu zahlen hat
	 * wird erhoht über eine bestellung, wird auf 0 gesezt durch bezahlen
	 */
	private double rechnungsHöhe;
	/**
	 * Enthält die information der zustimmund der werbung bei der Kunde
	 * kann geändert werden
	 */
	private boolean werbungErlaubt;
	
	//+***********************************************************
	//******Methoden
	//***********************************************************
	/**
	 * Hier ohne static: wird von Kunden-object durchgeführt/erledigt
	 * hier KEIN static
	 * innerhalb der methode können Atribute geändert werden
	 * preise: eine lokale variable
	 * Lokale variabeln: Deklaration innerhalb einer Methode/ , nur gültig innerhalb der Methode gültig
	 * @param preise erhöht die RechnungsHöhe
	 */
	public void bestellen(double preise) {
		rechnungsHöhe = rechnungsHöhe + preise;
	}
	/**
	 * Die gesammte rechnung wird genau bezahlt
	 */
	public void bezahlen () {
		rechnungsHöhe= 0;
	}
	/**
	 * Wenn Werbung vor Ausführung der Methode erlaubt war ist sie danach verboten
	 *  Wenn Werbung vor Ausführung der Methode verboten war ist sie danach erlaubt
	 */
	public void werbereinstellungAendern() {
		werbungErlaubt = !werbungErlaubt;
	}
	
	//*******MeThoden die wegen der Datenkapselung(private)notwendig sind: GETTER und SETTER********
	/**
	 * wie hoch ist die Rechnung im Moment?
	 * Sichtbarmachen durch GET atributten außerhalb der klasse + Atributsbezeichner mit
	 * Änderung der erste Buchstaben von klein zu groß
	 */
	public double getRechnungsHöhe() {
		return rechnungsHöhe;
	}
	
	/**
	 * wenn ein Atribut festgelegt oder geändert werden soll: SET-methode
	 */
	public void setName(String kundenname) {
		name = kundenname;
	}
	/**
	 * auch für den Namen ein get
	 */
	public String getName() {
		return name;
	}
	/**
	 * wenn ein boolean: is
	 */
	public boolean isWerbungErlaubt() {
		return werbungErlaubt;
		
	}
}
/*
* Erstellen eines neuen Projekts: Objekte/Klasse testen
* Klassen erstellen, Attribute und Methoden festlegen, Objekte der Klassen erstellen und testen
* Beispiel: Tier, Attribute Besitzername, Art, Methoden getter/setter, fressen
* Beispiel: Koch, Attribute Name, Lieblingsgericht, Methoden getter/setter, kochen
* Beispiel: Nachbarin, Regenwurm, Auto, 
* schwierig: Buch, Kaffee, Kartoffel...
*/
