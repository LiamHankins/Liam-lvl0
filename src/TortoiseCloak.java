
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseCloak {
	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
		String idk=JOptionPane.showInputDialog("Color Please");
		//4. use an if/else statement to set the pen color that the user requested
if (idk.equals("blue")) {
	Tortoise.setPenColor(Color.red);}
else if (idk.equals("red")){
Tortoise.setPenColor(Color.cyan);}
else{          
	Tortoise.setPenColor(Color.BLUE);
}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		//Tortoise.setPenWidth(1000000);
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
		Tortoise.penDown();
		Tortoise.show();
		Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.explode();


	}
}



