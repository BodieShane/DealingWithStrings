package string.view;

import javax.swing.JOptionPane; 
public class PopupDisplay
/**
 * A popup display class used for showing input and output
 * @author bsha6756
 * @version 1.0 09/24/15
 */
{
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}

}
