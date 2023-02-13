package fassade.produktion;

public class Camera 
{
	private double blende;
	
	public Camera(double blende)
	{
		this.blende = blende;
	}

	public Bild aufname() 
	{
		System.out.println(this.getClass().getName() + ": Mache Aufnahme");
		return new Bild();
	}
}
