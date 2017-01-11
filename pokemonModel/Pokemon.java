package pokemonModel;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	
	public Pokemon(String name, int number)
	{
		
	}
	public String getPokemonTypes()
	{
		String types = "this pokemon is type :\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			
			pokeTypes[index] = temp;
		}
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + "", "");
			pokeTypes += temp + "\n";
		}
		return types;
	}
	
	public String toString()
	{
		return toString();
	}
	public String getPokemonInformation()
	{
		return getPokemonInformation();
	}
	public int getHealthPoints()
	{
		return healthPoints;
	}
	public int getAttackPoints()
	{
		return attackPoints;
	}
	public double getSpeed()
	{
		return speed;
	}
	public int getNumber()
	{
		return number;
	}
	public String getName()
	{
		return name;
	}
	public void setHealthPoints(int healthPoints)
	{
		
	}
	public void setAttackPoints()
	{
		
	}
	public void setSpeed()
	{
		
	}
	public void setName(String name)
	{
		
	}
	
}
