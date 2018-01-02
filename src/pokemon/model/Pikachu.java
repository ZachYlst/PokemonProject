package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super(25, "Pikachu");
		setup();
	}
	
	public Pikachu(String name)
	{
		super(25, name);
		setup();
	}
	
	public Pikachu(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(55);
		this.setCanEvolve(true);
		this.setEnhancementModifier(1);
		this.setHealthPoints(35);
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
