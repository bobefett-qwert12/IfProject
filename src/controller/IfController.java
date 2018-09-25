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
		JOptionPane.showMessageDialog(null, "You either kill yourself or you get killed.");
		// startLooping();
		askUser();
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
		String response = JOptionPane.showInputDialog(null, "What is the distance?");
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "How about an actual number for the distance?");
		}
	}
	private boolean validDouble(String maybeDouble) {
		boolean isValid = false;
		try {
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Sorry, that's not a double.");
		}
		return isValid;
	}
}
