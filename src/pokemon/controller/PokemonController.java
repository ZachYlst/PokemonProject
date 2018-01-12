package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class PokemonController
{
	public void start()
	{
		
	}

	private PokemonFrame appFrame;
	
	private void buildPokedex()
	{
		pokedex.add(new Charmander());
		pokedex.add(new Charizard());
		pokedex.add(new Snivy());
		pokedex.add(new Bulbasaur());
		pokedex.add(new Pikachu());
		pokedex.add(new LeBurninator());
	}
	
	public ArrayList<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)		//If an integer is not input...
		{
			System.out.println("Only integer values are accepted: " + input + " is not");
		}
			
			return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			System.out.println("Only double values are accepted: " + input + " is not");
		}
	
		return valid;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
	}
}
