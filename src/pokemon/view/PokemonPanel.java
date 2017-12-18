package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JPanel;
import java.awt.Color;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupBackgroundColor();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupBackgroundColor()
	{
		int blue = (int) (Math.random() * 256);
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
