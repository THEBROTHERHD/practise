package fassade.produktion;

public class ProduktionTest {

	public static void main(String[] args) 
	{
		// Montage des Lenkers
		Montage.montiere(MontageElement.LENKER);
				
		// Montage des Vorderrads
		Montage.montiere(MontageElement.VORDERRAD);
		
		// Montage der Bremse
		Montage.montiere(MontageElement.BREMSE);
	}

}
