package fassade.produktion;

public class Schrauber {

	public void dreheSchraubeEin(double anzugsdrehmomentNm) 
	{
		System.out.println(this.getClass().getName() + ": Drehe Schraube mit " + anzugsdrehmomentNm + " NM ein"); 
	
	}
}
