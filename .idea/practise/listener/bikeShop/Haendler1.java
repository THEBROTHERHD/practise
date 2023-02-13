package listener.bikeShop;

public class Haendler1 implements Interessent
{
	private String name;
	private int lieferzeitLimitD;
	
	public Haendler1(String name, int lieferzeitLimitD)
	{
		this.name = name;
		this.lieferzeitLimitD = lieferzeitLimitD;
	}


	@Override
	public void benachrichtige(Fahrrad fahrrad) {
		if (fahrrad.getLieferzeitD() >= this.lieferzeitLimitD)
		{
			System.out.println("Haendler " + this.name + " moechte Fahrrad bestellen");
			System.out.println(" Vereinbare Termin ...");
		}
	}
}
