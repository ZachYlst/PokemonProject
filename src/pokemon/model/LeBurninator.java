package pokemon.model;

public class LeBurninator extends Pokemon implements Fire, Electric
{
	public LeBurninator()
	{
		super(808, "Le Burninator");
		setup();
	}
	
	public LeBurninator(String name)
	{
		super(808, name);
		setup();
	}
	
	public LeBurninator(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(98);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1);
		this.setHealthPoints(80);
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
	
	public void electrocute()
	{
		
	}
	
	public void stun()
	{
		
	}
	
	public int recharge(int amount)
	{
		return amount;
	}
}
