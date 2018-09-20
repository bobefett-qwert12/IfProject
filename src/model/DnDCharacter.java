package model;

public class DnDCharacter
{
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	public DnDCharacter(int str, int dex, int con, int intel, int wis, int cha)
	{
		this.strength = str;
		this.dexterity = dex;
		this.constitution = con;
		this.intelligence = intel;
		this.wisdom = wis;
		this.charisma = cha;
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

	public void setStr(int str)
	{
		this.strength = str;
	}
	
	public void setDex(int dex) {
		this.dexterity = dex;
	}
	
	public void setCon(int con) {
		this.constitution = con;
	}
	
	public void setIntel(int intel) {
		this.intelligence = intel;
	}
	
	public void setWis(int wis) {
		this.wisdom = wis;
	}
	
	public void setCha(int cha) {
		this.charisma = cha;
	}
}
