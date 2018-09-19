// lumel17
/*
 * Melinda Lu
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */

	 private String name;
	 public Homework2(String name) {
			this.name = name;
		  }

	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */

	 public String uppercase() {
	 return name.toUpperCase();
 }


	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */

	 public String strip(String words) {
	 words = words.replace(".", "");
	 words = words.replace(",", "");
	 words = words.replace(" ", "");
	 words = words.replace("!", "");
	 return words;
 }


	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = new Rectangle(5, 10, 15, 20).getWidth();
		Rectangle r2 = new Rectangle(5, 10, 15, 20);
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle();
		r3.translate(10, 30);
		return r3;
	}



	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	 public double getPerimeter(Rectangle rect) {
			return (2 * rect.getHeight()) + (2 * rect.getWidth());
 }

}
