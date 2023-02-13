package adapter;

public class Speedometer
{
	private double mileage;
	private double totalTimeMin;
	
	public Speedometer()
	{
		this.putBackToZero();
	}

	protected void putBackToZero()
	{
		this.mileage = 0; 
		this.totalTimeMin = 0;
	}
	
	public void measure(double drivenMiles, double timeMin)
	{
		this.mileage += drivenMiles;
		this.totalTimeMin += timeMin;
	}
	
	public double getAverageSpeedMpH()
	{
		return this.mileage / (this.totalTimeMin / 60);
	}
}
