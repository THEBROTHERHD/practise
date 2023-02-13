package adapter;

public class Tachometer implements ITachometer
{
	private double gesamtStreckeKm;
	private double gesamtZeitH;
	
	public Tachometer()
	{
		this.reset();
	}

	protected void reset()
	{
		this.gesamtStreckeKm = 0; 
		this.gesamtZeitH= 0;
	}
	
	public void messe(double gefahreneStreckeKm, double zeitH)
	{
		this.gesamtStreckeKm += gefahreneStreckeKm;
		this.gesamtZeitH += zeitH;
	}
	
	public double getDurchschnittsgeschwindigkeitKmH()
	{
		return this.gesamtStreckeKm / this.gesamtZeitH;
	}
}
