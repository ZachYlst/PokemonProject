package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel iconLabel;
	private JLabel healthLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel attackLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		iconLabel = new JLabel("POKEDEX", new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		healthLabel = new JLabel("health");
		nameLabel = new JLabel("name");
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, -32, SpringLayout.NORTH, nameLabel);
		numberLabel = new JLabel("number");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 11, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 15, SpringLayout.NORTH, this);
		evolvableLabel = new JLabel("evolvable");
		modifierLabel = new JLabel("modifier");
		appLayout.putConstraint(SpringLayout.SOUTH, modifierLabel, -127, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 12, SpringLayout.SOUTH, modifierLabel);
		attackLabel = new JLabel("attack");
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -13, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -11, SpringLayout.NORTH, modifierLabel);
		evolvableBox = new JCheckBox();
		appLayout.putConstraint(SpringLayout.EAST, evolvableLabel, -38, SpringLayout.WEST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		nameField = new JTextField("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -11, SpringLayout.EAST, this);
		numberField = new JTextField("##");
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -40, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		attackField = new JTextField("ap");
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -41, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, evolvableBox);
		healthField = new JTextField("hp");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, evolvableBox);
		modifierField = new JTextField("mod");
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, -38, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, evolvableBox);
		descriptionArea = new JTextArea(5, 10);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -1, SpringLayout.SOUTH, this);
		typeArea = new JTextArea(4, 15);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 0, SpringLayout.NORTH, descriptionArea);
		saveButton = new JButton("save");
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 6, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 6, SpringLayout.EAST, typeArea);
		clearButton = new JButton("clear");
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, 0, SpringLayout.SOUTH, typeArea);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, nameField);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 51, SpringLayout.WEST, this);
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 6, SpringLayout.EAST, firstType);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, iconLabel);
		secondType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, secondType, -277, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 6, SpringLayout.EAST, secondType);
		thirdType = new JPanel();
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 0, SpringLayout.WEST, iconLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, -16, SpringLayout.NORTH, firstType);
		fourthType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, fourthType, -6, SpringLayout.WEST, typeArea);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, 0, SpringLayout.SOUTH, fourthType);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, -11, SpringLayout.NORTH, fourthType);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, -10, SpringLayout.SOUTH, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupComboBox();
//		setupBackgroundColor();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.setBackground(Color.RED);
		this.add(iconLabel);
		this.add(healthLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(attackLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);	
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
//	private void setupBackgroundColor()
//	{
//		int blue = (int) (Math.random() * 256);
//		int red = (int) (Math.random() * 256);
//		int green = (int) (Math.random() * 256);
//		
//		this.setBackground(new Color(red, green, blue));
//	}	
}
