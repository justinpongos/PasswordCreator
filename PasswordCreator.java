import javax.swing.JOptionPane;
	public class PasswordCreator {
		public static void main(String[] args) {
			String n = JOptionPane.showInputDialog("What is your last name?");
			String p = JOptionPane.showInputDialog("What would you like your password to be?");
			
			boolean o = false;
			String nA = "+-*/!@";
			
			while (o == false) {
				if(p.toLowerCase().indexOf(n.toLowerCase()) > -1) {
					p = JOptionPane.showInputDialog("Password Is Invalid, Please try again");
					for(int index = 0; index < nA.length(); index ++) {
						if(p.toLowerCase().indexOf(nA.toLowerCase().substring(index, index + 1)) > 1) {
							System.out.println("Password Was Successfully Created");
							break;
					}//end if
				}//end for
			}//end if
		}//end while
	}//end main
}//end class
