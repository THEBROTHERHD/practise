package fassade.produktion;

public class Pose 
{
	private double x;
	private double y;
	private double z;
	private double a;
	private double b;
	private double c;
	
	public Pose(double x, double y, double z, double a, double b, double c)
	{
		this.x = x; 
		this.y = y;
		this.z = z;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String toString()
	{
		return new String(
				" x: " + Double.toString(this.x) +
				" y: " + Double.toString(this.y) +
				" z: " + Double.toString(this.z) + 
				" a: " + Double.toString(this.a) +
				" b: " + Double.toString(this.b) +
				" c: " + Double.toString(this.c));
	}
}
