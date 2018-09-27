package controller;

//import section
import model.DnDCharacter;
import javax.swing.JOptionPane;

public class IfController
{
	/**
	 * Builds the instance of the Controller
	 */
	public IfController()
	{

	}

	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		//JOptionPane.showMessageDialog(null, "You either kill yourself or you get killed.");
		//startLooping();
		for (int i = 0; i <3; i++) {
			JOptionPane.showMessageDialog(null, "You will be making a new DnD Character. This is Character #" + (i+1) + ":");
			askUser();
		}
	}

	private void startLooping()
	{
		boolean isDone = false;
		int count = 0;
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "Hey! Ho! What'chu gon' do?");
			count--;
			if (count <= -10)
			{
				isDone = true;
			}
		}
		for (int i = 15; i > 0; i--)
		{
			JOptionPane.showMessageDialog(null, "There are " + i + " repetitions left.");
		}
	}

	private void askUser()
	{
		DnDCharacter userChar = new DnDCharacter();
		String response = JOptionPane.showInputDialog(null, "What is your character's name?");
		userChar.setName(response);
		response = JOptionPane.showInputDialog(null, "What is your character's strength?");
		while (response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the strength?");
		}
		userChar.setStr(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's dexterity?");
		while (response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the dexterity?");
		}
		userChar.setDex(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's constitution?");
		while (response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the constitution?");
		}
		userChar.setCon(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's intelligence?");
		while (response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the intelligence?");
		}
		userChar.setIntel(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's wisdom?");
		while (response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the wisdom?");
		}
		userChar.setWis(Integer.parseInt(response));
		response = JOptionPane.showInputDialog(null, "What is your character's charisma?");
		while (response == null || !validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the charisma");
		}
		userChar.setCha(Integer.parseInt(response));
		JOptionPane.showMessageDialog(null, userChar);
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Sorry, that's not a double.");
		}
		return isValid;
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Sorry, that's not an integer.");
		}
		return isValid;
	}
}
