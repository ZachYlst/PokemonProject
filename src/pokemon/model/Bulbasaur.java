package pokemon.model;

public class Bulbasaur extends Pokemon implements Grass
{
	public Bulbasaur()
	{
		super(1, "Bulbasaur");
		setup();
	}
	
	public Bulbasaur(String name)
	{
		super(1, name);
		setup();
	}
	
	public Bulbasaur(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(49);
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
