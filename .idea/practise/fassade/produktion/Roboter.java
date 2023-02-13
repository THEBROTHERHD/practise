package fassade.produktion;

public class Roboter 
{
	private Schrauber schrauber;
		
	public Roboter(Schrauber schrauber)
	{
		this.schrauber = schrauber;
	}

	public void move(Pose pose) 
	{
		System.out.println(this.getClass().getName() + ": Fahre an Position " + pose);
	}
}
