package model;

public class DnDCharacter
{
	// data members
	private String name;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	// constructors
	/**
	 * Default constructor for when you don't know the parameters.
	 * Initializes data members with default values.
	 */
	public DnDCharacter()
	{
		this.name = "";
		this.strength = 0;
		this.dexterity = 0;
		this.constitution = 0;
		this.intelligence = 0;
		this.wisdom = 0;
		this.charisma = 0;
	}

	/**
	 * Better constructor for when you know the parameter values.
	 * 
	 * @param name
	 *            name of the character
	 * @param str
	 *            strength of the character (1-30)
	 * @param dex
	 *            dexterity of the character (1-30)
	 * @param con
	 *            constitution of the character (1-30)
	 * @param intel
	 *            intelligence of the character (1-30)
	 * @param wis
	 *            wisdom of the character (1-30)
	 * @param cha
	 *            charisma of the character (1-30)
	 */
	public DnDCharacter(String name, int str, int dex, int con, int intel, int wis, int cha)
	{
		this.name = name;
		this.strength = str;
		this.dexterity = dex;
		this.constitution = con;
		this.intelligence = intel;
		this.wisdom = wis;
		this.charisma = cha;
	}

	// getters
	public String getName()
	{
		return this.name;
	}

	public int getStr()
	{
		return this.strength;
	}

	public int getDex()
	{
		return this.dexterity;
	}

	public int getCon()
	{
		return this.constitution;
	}

	public int getIntel()
	{
		return this.intelligence;
	}

	public int getWis()
	{
		return this.wisdom;
	}

	public int getCha()
	{
		return this.charisma;
	}

	// setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setStr(int str)
	{
		this.strength = str;
	}

	public void setDex(int dex)
	{
		this.dexterity = dex;
	}

	public void setCon(int con)
	{
		this.constitution = con;
	}

	public void setIntel(int intel)
	{
		this.intelligence = intel;
	}

	public void setWis(int wis)
	{
		this.wisdom = wis;
	}

	public void setCha(int cha)
	{
		this.charisma = cha;
	}
	
	public String getCharacter() {
		String user;
		user = "Your character, " + name
				+ " has a strength of " + strength
				+ ", a dexterity of " + dexterity
				+ ", a constitution of " + constitution
				+ ", an intelligence of " + intelligence
				+ ", a wisdom of " + wisdom
				+ ", and a charisma of " + charisma;
		return user;
	}
}
