package vectors.verwaltung;

import java.util.ArrayList;

public class FahreTest {

	public static void main(String[] args) 
	{
		Fahrzeug f0 = new Fahrzeug(0, 800);
		Fahrzeug f1 = new Fahrzeug(1, 1200);
		Fahrzeug f2 = new Fahrzeug(2, 1600);

		Faehre faehreA = new Faehre();

		faehreA.fahrzeuge.add(new ArrayList<>());
		faehreA.fahrzeuge.add(new ArrayList<>());
		faehreA.fahrzeuge.add(new ArrayList<>());
		
		faehreA.fahrzeuge.get(0).add(f0);
		faehreA.fahrzeuge.get(0).add(f1);
		faehreA.fahrzeuge.get(0).add(f2);

		faehreA.fahrzeuge.get(1).add(f0);
		faehreA.fahrzeuge.get(1).add(f1);
		faehreA.fahrzeuge.get(1).add(f2);

		faehreA.fahrzeuge.get(2).add(f0);
		faehreA.fahrzeuge.get(2).add(f1);
		faehreA.fahrzeuge.get(2).add(f2);

		for (int i = 0; i < faehreA.fahrzeuge.size(); i++)
		{
			for (int j = 0; j < faehreA.fahrzeuge.get(i).size(); j++)
			{
				System.out.print(faehreA.fahrzeuge.get(i).get(j).id + " ");
			}
			System.out.println();
		}
		
		double gesamtgewicht = 0;

		for (int i = 0; i < faehreA.fahrzeuge.size(); i++)
		{
			for (int j = 0; j < faehreA.fahrzeuge.get(i).size(); j++)
			{
				gesamtgewicht += faehreA.fahrzeuge.get(i).get(j).gewicht;
			}
		}

		System.out.println("Gesamtgewicht " + gesamtgewicht);
	}
}
