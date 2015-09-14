import javax.swing.JOptionPane;

public class usernumber {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("TYPE IN A NUMBER!!!!!");
		int P = Integer.parseInt(number);
		//for (int u = 0; u <= P; u++) {
		//	System.out.println(u);
		//}
	
			String OP = JOptionPane.showInputDialog("give me yeh 2nd number");
			int r = Integer.parseInt(OP);
			for (int q = 0; q <= P; q+=r) {
				System.out.println(q);

			}
		}
	}


	