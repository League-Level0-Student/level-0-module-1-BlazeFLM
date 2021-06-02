/*Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
Mushroom, Mushroom

Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger
Mushroom, Mushroom

A Snake!!!
*/
package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {

		int count2 = 0;
		while (count2 < 2) {
			count2 = count2 + 1;
			String badger = "Badger";
			String mushroom = "Mushroom";
			int count = 0;
			while (count < 12) {
				System.out.print(badger + ", ");
				count = count + 1;
			}
			System.out.println();
			count = 0;
			while (count < 2) {
				System.out.print(mushroom + ", ");
				count = count + 1;
			}
			System.out.println();
			
		}
		System.out.println("A Snake!!!");
	}
}
