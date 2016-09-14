package Monster.model;

public class Marshmellow 
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public Marshmellow()
	{
		this.name = "no name";
		this.antennaCount = -123435.32;
		this.eyeCount = -876543;
		this.legCount = -5678765;
		this.noseCount = -2;
		this.hasBellyButton = false;
	}
	
	public Marshmellow(String name, double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		
	}
	
	/*
	 * monster name is sir.Maralsh's Worth
	 * has 324.324 antenna
	 * has 2 legs
	 * has 0 nose
	 * has 2 eyes
	 * does not have a belly button
	 */
}
