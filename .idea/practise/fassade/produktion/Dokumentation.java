package fassade.produktion;
import java.util.Vector;

public class Dokumentation 
{
	private Vector<Bild> bilder = new Vector<Bild>();
	private Vector<String> beschreibung = new Vector<String>();
	
	public void add(String beschreibung, Bild aufnahme) 
	{
		this.beschreibung.add(beschreibung);
		this.bilder.add(aufnahme);
		System.out.println(this.getClass().getName() + ": Dokumentiere " + beschreibung); 
	}

}
