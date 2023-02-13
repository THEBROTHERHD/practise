package kompositum.versand;
import java.util.Vector;

public class Box implements Inhalt
{
	private String name;
	public Vector<Inhalt> inhalt = new Vector<Inhalt>();
	
	Box(String name)
	{
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getGewichtKg() {
		double gewicht = 0;
		System.out.println("--- Neue Box ---");
		for (Inhalt a : inhalt)
		{
			gewicht += a.getGewichtKg();
		}
		System.out.println("Gewicht für box " + name + " = " + gewicht);
		return gewicht;
	}
}
