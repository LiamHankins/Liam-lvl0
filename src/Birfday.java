
import javax.swing.JOptionPane;

public class Birfday {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String mom = "Around July";
		String dad = "Around June";
		String me = "May 10th";
		
String name=JOptionPane.showInputDialog( "What birthday do you want?");
		// 2. Find out which birthday the user wants and and store their response in a variable
	JOptionPane.showMessageDialog(null, name);
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
	if  (name.equals("mom")) {JOptionPane.showMessageDialog(null, mom);}
		// 5. if user asked for "dad"
			// print dad's birthday
	if (name.equals("dad")) {JOptionPane.showMessageDialog(null, dad);}
		// 6. if user asked for your name
			// print myBirthday
	if (name.equals("me")) {JOptionPane.showMessageDialog(null, me);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}}