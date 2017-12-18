package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private JLabel pokemonPicture;
	private JComboBox comboBox;
	private SpringLayout appLayout;
	private JButton saveButton;
	private JButton resetButton;
	private JButton loadButton;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		JLabel pokemonPicture = new JLabel("(insert picture here)");
		appLayout.putConstraint(SpringLayout.NORTH, pokemonPicture, 21, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokemonPicture, 23, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, pokemonPicture, 170, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, pokemonPicture, 143, SpringLayout.WEST, this);
		JComboBox comboBox = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, comboBox, -77, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, comboBox, 22, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, comboBox, -50, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, comboBox, 154, SpringLayout.WEST, this);
		JButton saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.WEST, saveButton, -90, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -10, SpringLayout.EAST, this);
		JButton resetButton = new JButton("Reset");
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, resetButton, -41, SpringLayout.EAST, this);
		JButton loadButton = new JButton("Load");
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -91, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -165, SpringLayout.EAST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupBackgroundColor();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		add(pokemonPicture);
		add(comboBox);
		add(saveButton);
		add(resetButton);
		add(loadButton);
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
