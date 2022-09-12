package tests;

import de.bohne.personen.Kunde;

//sucht Kunde und ersetzt de.boh.....  vor dem kompilieren
/**
 * Testen den Datentype und das Tamplate Kunde
 * 
 * Vollqualifizierte Klassenname: de.bohne.personen.Kunde
 * kunde: simple name
 * 
 * .operator:gibt über die Referenz einen Auftrag an ein Object
 * @author Alfa
 *
 */
public class KundeTest {
	
	/**
	 * Ablauf des programs
	 * 
	 * kundenobjecte werden erstellt,
	 * kunden werden bestellen , bezahlen, werbeeinstellung ändern
	 * @param args wird hier nicht verwendet
	 */
	public static void main(String[] args) {
		de.bohne.personen.Kunde justus;
		justus = new de.bohne.personen.Kunde();
		
		de.bohne.personen.Kunde peter = new de.bohne.personen.Kunde();
		Kunde bob = new Kunde();
		Kunde abas = new Kunde();
		
		//justus bestellt für 11.99
		justus.bestellen(11.99);//justus: rechnungshöhe 11.99
		
		peter.bestellen(3.99); //peter : rechnungshöhe 3.99
		
		bob.bestellen(1.11);//bob: rechnungshöhe 1.99
		
		
		bob.werbereinstellungAendern();
		
		peter.bezahlen();//rechnungshöhe 0.0
		
	//	System.out.println("justus muss noch bezahlen:" + justus.rechnungsHöhe);
		System.out.println("justs muss noch " + justus.getRechnungsHöhe() + " bezahlen");
		bob.setName("bob andreas");
		if(bob.isWerbungErlaubt()) {
			System.out.println(bob.getName() +"bekommt bald eine werbemaill");
		}
		
		Kunde[] dieKunden = new Kunde [3];
		dieKunden[0] = justus;
		dieKunden[1]= abas;
		dieKunden[2]= bob;
		for(int i = 0; i < dieKunden.length; i++) {
			System.out.println(dieKunden[i]);
		}
		System.out.println(abas.getName() +"bekommt bald eine werbemail");
	}

}
