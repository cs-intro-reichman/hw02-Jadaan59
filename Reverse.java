/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];

		for (int i = str.length() - 1; 0<=i; i--){
			char c = str.charAt(i);
			System.out.print(c);
		}
			System.out.println("");

		if (((int)str.length()) % 2 == 0){
			System.out.println("The middle character is " + str.charAt((int)((str.length())/2)-1));
		} else {
			System.out.println("The middle character is " + str.charAt((int)((str.length())/2)));
		}
	}
}
