package fassade.produktion;

public class ComputerVision {

	private Camera camera;
	
	public ComputerVision(Camera camera) 
	{
		this.camera = camera;
	}

	public Pose sucheLoch(double durchmesser) 
	{
		System.out.println(this.getClass().getName() + ": Suche Lock mit Durchmesser " + durchmesser); 
		return new Pose(Math.random(), Math.random(), Math.random(),
				Math.random(), Math.random(), Math.random());
	}

}
