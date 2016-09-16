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
	
	public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getLegCount()
	{
		return legCount;
	}
	
	public int geteyeCount()
	{
		return eyeCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	
	public void setLegCount(int legCount)
	{
		this.legCount = legCount;
	}
	
	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
}
