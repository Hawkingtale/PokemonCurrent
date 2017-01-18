package pokemonController;

import pokemonView.PokemonFrame;
import pokemonModel.*;
import java.util.ArrayList;

public class PokemonController

{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	public Aegislash aegislash;
	public Bronzong bronzong;
	public Gallade gallade;
	public Flygon flygon;
	public Metagross metagross;
	
	PokemonController()
	{
		this.pokedex = new ArrayList<Pokemon>();
		makePokedex();
		baseFrame = new PokemonFrame(this);
	}
	
	private void makePokedex()
	{
		aegislash = new Aegislash();
		bronzong = new Bronzong();
		gallade = new Gallade();
		flygon = new Flygon();
		metagross = new Metagross();
		
		pokedex.add(aegislash);
		pokedex.add(bronzong);
		pokedex.add(gallade);
		pokedex.add(flygon);
		pokedex.add(metagross);
		
	}
	
	public void updateSelected(int index,String name,int attack, int health, double speed)
	{
		Pokemon currentPokemon = pokedex.get(index);
		currentPokemon.setName(name);;
		currentPokemon.setAttackPoints(attack);
		currentPokemon.setHealthPoints(health);
		currentPokemon.setSpeed(speed);
	}
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	public void start()
	{
		
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}

}
