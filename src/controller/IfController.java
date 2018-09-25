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
		startLooping();
	}

	private void startLooping()
	{
		boolean isDone = false;
		int count = 0;
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "Hey! Ho! What'chu gon' do?");
			count --;
			if(count <= -10) {
				isDone = true;
			}
		}
	}
}
