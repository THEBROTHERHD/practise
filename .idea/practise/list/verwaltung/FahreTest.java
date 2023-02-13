package list.verwaltung;
public class FahreTest {

	public static void main(String[] args) 
	{
		int elements = 100000;
		Faehre faehreA = new Faehre();
		for (int i = 0; i < elements; ++i)
		{
			faehreA.fahrzeuge.add(new Fahrzeug(i, 1000));
		}
		
		long start = System.nanoTime();
		while (!faehreA.fahrzeuge.isEmpty())
		{
			int auswahl = faehreA.fahrzeuge.size() / 2;
			//int auswahl = faehreA.fahrzeuge.size() -1;
			Fahrzeug mittleresFahrzeug = faehreA.fahrzeuge.remove(auswahl);
			//System.out.println(mittleresFahrzeug.id);
		}
		long end = System.nanoTime();
		System.out.println("Dauer " + (end - start) + " ns");
		System.out.println("Dauer " + (end - start) / 1000000.0 + " ms");
		System.out.println("Dauer " + (end - start) / 1000000000.0 + " s");
	}
}
