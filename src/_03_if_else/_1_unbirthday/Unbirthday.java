package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = JOptionPane.showInputDialog("Is it your birthday? Give me the month and day with the slash in between.");
String date = "5/25";
	if (input .equals(date)) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	} else {
		JOptionPane.showMessageDialog(null," vErY mErRy UnBiRtHdAy");
	}
	}

}
