package string.view;

import javax.swing.JOptionPane; 
public class PopupDisplay
/**
 * A popup display class used for showing input and output
 * @author bsha6756
 * @version 1.0 09/24/15
 */
{
	/**
	*Display the supplied test as a popup window. 
	*@param words from somewhere.
	*/
	
	/**
	*displays a popup with the supplied strings parameter with a field to type in a response.
	*@param stuff A question to be a displayed in the popup window.
	*@return the user’s input as a string data type
	*/


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
