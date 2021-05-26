package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		  String answer1 = JOptionPane.showInputDialog("A man was outside in the rain without an umbrella or hat. \n His hair didn't get wet. Why? ");
		  
		  // 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer1.equals ("He was bald")) {
		JOptionPane.showMessageDialog(null, "Correct! I know you searched it up.");
		score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! Use Google, I didn't say you couldn't.");
		}
		// 5. Otherwise say "wrong" and tell them the answer
		String answer2 = JOptionPane.showInputDialog("What has to be broken before you can use it?");
		// 6. Add some more riddles
				if(answer2.equals("an egg")) {
				JOptionPane.showMessageDialog(null,"Correct! I know you searched it up.");
				score++;
				} else {
					JOptionPane.showMessageDialog(null,"Wrong! Use Google, I didn't say you couldn't.");
				}
				String answer3 = JOptionPane.showInputDialog("What gets wet while drying?");
				if(answer3.equals("A towel")) {
				JOptionPane.showMessageDialog(null,"Correct! I know you searched it up.");
				score++;
				} else {
					JOptionPane.showMessageDialog(null,"Wrong! Use Google, I didn't say you couldn't.");
				}
				// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null, score);
	}
}

