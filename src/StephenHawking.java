

import java.io.IOException ;

import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {
		String idk=JOptionPane.showInputDialog("Sentence please");
		speak(idk);
	}
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say "+ words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
