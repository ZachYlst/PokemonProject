package pokemon.model;

public class Charizard extends Charmander
{
	public Charizard()
	{
		super(6, "Charizard");
		setup();
	}
	
	public Charizard(String name)
	{
		super(6, name);
		setup();
	}
	
	public Charizard(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(84);
		this.setCanEvolve(false);
		this.setHealthPoints(78);
	}
	
	public void incinerate()
	{
		
	}
	
	public void chomp()
	{
		
	}
	
	public int overheat(int amount)
	{
		return amount;
	}
}
