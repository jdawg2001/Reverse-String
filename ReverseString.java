package exercises;

public class ReverseString {
/*Example of a common Interview Question:
 * Assume you have a string: "It is a test string"
 * You need to write a code to reverse the characters of the string 
 * Reverse String Output -> "string test a is It"
 * Reverse Character Output -> "gnirts tset a si tI"
 * Implement the knowledge of past lectures
 * Will need knowledge of: Strings;  If Conditions and For Loops and some built in functions also
 * Try to do some checks for the input string to make sure it is a valid string
 * Try to use Scanner Class from Java to take the input from user instead of providing form the main method
 */
	public static void main(String[] args) {
		String input = "this is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	// There is no built-in reverse method for strings in Java
	// There is one with String Builder, which does not give the output we want
	private static String reverse(String input) {
		String reverse = "";
		
		if (input.isEmpty() || input == null) {
			System.out.println("Empty and null strings are not accepted");
		}
		
		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			for (String item : originalArray) { // this, is, a, test, string
				reverse = item + " " + reverse; // this + "", is + this, a + is this, test + a is this, string + test a is this
			}
		}
		
		return reverse.trim();

	}

}
