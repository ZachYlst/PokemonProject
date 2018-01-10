package pokemon.controller;

import pokemon.model.Pokemon;
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
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Only integer values are accepted");
		}
		
			return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Only integer values are accepted");
		}
			
			return valid;
	}
}
