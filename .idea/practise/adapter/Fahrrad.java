package adapter;

public class Fahrrad 
{
	private int id;
	private ITachometer tachometer;

	public Fahrrad(int id, ITachometer tachometer)
	{
		this.id = id;
		this.tachometer = tachometer;
	}
	
	public void fahre(double km, double stunden)
	{
		this.tachometer.messe(km, stunden);
	}

	public double getDurchschnitt(){
		return this.tachometer.getDurchschnittsgeschwindigkeitKmH();
	}
}
