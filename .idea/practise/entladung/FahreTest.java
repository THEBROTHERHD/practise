package entladung;
public class FahreTest {

	public static void main(String[] args) 
	{
//		EinendFaehre einendFaehre = new EinendFaehre();
//		for (int i = 0; i < 1000; ++i)
//		{
//			einendFaehre.fahrzeuge[i] = new Fahrzeug(i, 1000);
//		}
//		
//		for (int i = 0; i < einendFaehre.fahrzeuge.length; ++i)
//		{
//			Fahrzeug entladung = einendFaehre.fahrzeuge[i];
//			System.out.println(entladung.id);
//			einendFaehre.fahrzeuge[i] = null;
//		}
		
		DoppelendFaehre doppelendFaehre = new DoppelendFaehre();
		for (int i = 0; i < doppelendFaehre.fahrzeuge.length; ++i)
		{
			doppelendFaehre.fahrzeuge[i] = new Fahrzeug(i, 1000);
		}
		
		for (int i = doppelendFaehre.fahrzeuge.length - 1; i >= 0; --i)
		{
			Fahrzeug entladung = doppelendFaehre.fahrzeuge[i];
			System.out.println(entladung.id);
			doppelendFaehre.fahrzeuge[i] = null;
		}
	}
}
