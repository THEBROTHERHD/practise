package listener.bikeShop;

public class PrivatKunde1 implements Interessent
{
	private String name;
	private double preisLimit;
	
	public PrivatKunde1(String name, double preisLimit)
	{
		this.name = name;
		this.preisLimit = preisLimit;
	}

	@Override
	public void benachrichtige(Fahrrad fahrrad) {
		if (fahrrad.getPreis() <= this.preisLimit)
		{
			System.out.println("Kunde " + this.name + " moechte ein Fahrrad kaufen");
			System.out.println("  Sende E-Mail ...");
		}
	}
}
