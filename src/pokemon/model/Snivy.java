package pokemon.model;

public class Snivy extends Pokemon implements Grass
{
	public Snivy()
	{
		super(495, "Snivy");
		setup();
	}
	
	public Snivy(String name)
	{
		super(495, name);
		setup();
	}
	
	public Snivy(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(45);
		this.setCanEvolve(true);
		this.setEnhancementModifier(1);
		this.setHealthPoints(45);
	}
	
	public void camouflage()
	{
		
	}
	
	public int plantFlowers(int amount)
	{
		return amount;
	}
	
	public void confuse()
	{
		
	}
}
