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
		// JOptionPane.showMessageDialog(null, "You either kill yourself or you get
		// killed.");
		// startLooping();
		loopForDays();
//		for (int i = 0; i < 3; i++)
//		{
//			JOptionPane.showMessageDialog(null, "You will be making a new DnD Character. This is Character #" + (i + 1) + ":");
//			askUser();
//		}
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

	public void loopForDays()
	{
		boolean isDone = false;
		while (!isDone)
		{
			String difficulty = JOptionPane.showInputDialog(null, "Welcome to the quiz show! Please enter your desired difficulty (1=easy, 2=average, 3=hard):");
			while (difficulty == null || !validInt(difficulty) || Integer.parseInt(difficulty) != 1 || Integer.parseInt(difficulty) != 2 || Integer.parseInt(difficulty) != 3)
			{
				difficulty = JOptionPane.showInputDialog(null, "Please enter 1 (easy), 2 (average), or 3 (hard) for difficulty:");
			}
			if (Integer.parseInt(difficulty) == 1)
			{
				int pointCount = 0;
				for (int i = 0; i < 5; i++)
				{
					String question = "";
					String correctAnswer = "";
					JOptionPane.showMessageDialog(null, "Question " + i + ":");
					switch (i)
					{
					case 1:
						question = "Which fictional city is the home of Batman?";
						correctAnswer = "gotham";
						break;
					case 2:
						question = "Babe Ruth is associated with which sport?";
						correctAnswer = "baseball";
						break;
					case 3:
						question = "According to the old proverb, to which European capital city do all roads lead?";
						correctAnswer = "rome";
						break;
					case 4:
						question = "What color is the circle on the Japanese national flag?";
						correctAnswer = "red";
						break;
					case 5:
						question = "What is the name of the city where the cartoon family The Simpsons live?";
						correctAnswer = "springfield";
						break;
					}
					String userAnswer = JOptionPane.showInputDialog(null, question);
					if (userAnswer.toLowerCase().equals(correctAnswer))
					{
						JOptionPane.showMessageDialog(null, "That's right! you did it!");
						pointCount ++;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Sorry, that's the wrong answer. The correct answer was " + correctAnswer + ".");
					}
				}
				JOptionPane.showMessageDialog(null, "Congratulations! you got " + pointCount + " points!");
				String playAgain = JOptionPane.showInputDialog(null, "Would you like to play again? y/n:");
				if (playAgain.toLowerCase().equals("n")) {
					isDone = true;
				}
			}
			else if (Integer.parseInt(difficulty) == 2)
			{
				int pointCount = 0;
				for (int i = 0; i < 5; i++)
				{
					String question = "";
					String correctAnswer = "";
					JOptionPane.showMessageDialog(null, "Question " + i + ":");
					switch (i)
					{
					case 1:
						question = "In the board game Risk, what color is Europe?";
						correctAnswer = "blue";
						break;
					case 2:
						question = "Fort Knox lies in which American state?";
						correctAnswer = "kentucky";
						break;
					case 3:
						question = "What mineral has the highest number on the Mohs hardness scale?";
						correctAnswer = "diamond";
						break;
					case 4:
						question = "What country was formerly known as Persia?";
						correctAnswer = "iran";
						break;
					case 5:
						question = "What country has the largest coastline?";
						correctAnswer = "canada";
						break;
					}
					String userAnswer = JOptionPane.showInputDialog(null, question);
					if (userAnswer.toLowerCase().equals(correctAnswer))
					{
						JOptionPane.showMessageDialog(null, "That's right! you did it!");
						pointCount ++;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Sorry, that's the wrong answer. The correct answer was " + correctAnswer + ".");
					}
				}
				JOptionPane.showMessageDialog(null, "Congratulations! you got " + pointCount + " points!");
				String playAgain = JOptionPane.showInputDialog(null, "Would you like to play again? y/n:");
				if (playAgain.toLowerCase().equals("n")) {
					isDone = true;
				}
			}
			else
			{
				int pointCount = 0;
				for (int i = 0; i < 5; i++)
				{
					String question = "";
					String correctAnswer = "";
					JOptionPane.showMessageDialog(null, "Question " + i + ":");
					switch (i)
					{
					case 1:
						question = "In which US state is John F. Kennedy buried?";
						correctAnswer = "virginia";
						break;
					case 2:
						question = "What musical term indicates a chord where the notes are played one after another, rather than all together?";
						correctAnswer = "arpeggio";
						break;
					case 3:
						question = "Which gas is formed when a hydrogen bomb goes off?";
						correctAnswer = "helium";
						break;
					case 4:
						question = "What color does gold leaf appear if you hold it up to the light?";
						correctAnswer = "green";
						break;
					case 5:
						question = "What is Woody Harrelson's middle name?";
						correctAnswer = "tracy";
						break;
					}
					String userAnswer = JOptionPane.showInputDialog(null, question);
					if (userAnswer.toLowerCase().equals(correctAnswer))
					{
						JOptionPane.showMessageDialog(null, "That's right! you did it!");
						pointCount ++;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Sorry, that's the wrong answer. The correct answer was " + correctAnswer + ".");
					}
				}
				JOptionPane.showMessageDialog(null, "Congratulations! you got " + pointCount + " points!");
				String playAgain = JOptionPane.showInputDialog(null, "Would you like to play again? y/n:");
				if (playAgain.toLowerCase().equals("n")) {
					isDone = true;
				}
			}
		}
	}
}
