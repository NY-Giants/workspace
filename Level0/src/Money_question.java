import javax.swing.JOptionPane;


public class Money_question {

	public static void main(String[] args) {
		String T = JOptionPane.showInputDialog("How does a nerd herd cost");
		float TInt = Float.parseFloat(T);
		String Q = JOptionPane.showInputDialog("How much do you have");
		Float QInt = Float.parseFloat(Q);
		if (QInt<TInt)
		{
		JOptionPane.showMessageDialog(null,"Error, error, error, error");
		}
		else{
			Float change = QInt-TInt;
			
			JOptionPane.showMessageDialog(null, "Your change is " + change);
			
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
