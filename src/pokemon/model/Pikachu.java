package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu(int number, String name)
	{
		super(number, name);
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
