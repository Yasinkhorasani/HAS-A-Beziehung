package tests;

import java.util.Random;
import de.bohne.markrting.WerbeKampagne;
import de.bohne.personen.Kunde;

/**
 * testet und verbessert die Klasse Werbekampagne
 * @author Alfa
 *
 */
public class WerbekampagneTest {

	public static void main(String[] args) {
	
		WerbeKampagne oktoberFest = new WerbeKampagne();
		oktoberFest.informierenDerKunden();
		
		Kunde[] auswahlKunden = new Kunde [5];
		//hier 0 Kunden, nur 5 kunden-referenzen
		// auswahlkunden[0] bleibt null um zu testen
		auswahlKunden[1] = new Kunde();
		auswahlKunden[1].setName("justus"); 
		
		auswahlKunden[2] = new Kunde();
		auswahlKunden[2].setName("Peter");
		
		auswahlKunden[3] = new Kunde();
		auswahlKunden[3].setName("Bob");
		
		auswahlKunden[4] = new Kunde();
		// setName("pumuukle") erstmal nicht durchgeführt 
		
		//Im Momment  will keiner der kunden werbung
		// wunsch: zufällig festlegen welcher Kunde seine werbeeinstellung andert
		//Lösung: random
		
		Random muenze = new Random();
		//Schleife startet bei 1 da diAuswahlkunde[0] ist null
		for(int i = 1; i< auswahlKunden.length; i++) {
			boolean aendern = muenze.nextBoolean();
			if(aendern) {
				auswahlKunden[i].werbereinstellungAendern();
			}
		}
		
		oktoberFest.setDieKunden(auswahlKunden);
		oktoberFest.setTitel("Blau und Weiß....");
		oktoberFest.setWerbetext("zu jedem weißen koffe gibt ess einen keks");
		oktoberFest.setDauer(10);
		oktoberFest.informierenDerKunden();
		System.out.println("Ende");
	}

}
