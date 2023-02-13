package kompositum.versand;

public class Artikel implements Inhalt
{
	private String name;
	private double gewichtKg;
	
	public Artikel(String name, double gewichtKg) 
	{
		this.name = name;
		this.gewichtKg = gewichtKg;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getGewichtKg() {
		System.out.println("Gewicht für artikel " + name + " = " + gewichtKg);
		return gewichtKg;
	}
}
