import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Read in message
	System.out.println("Give me a message");
		String message = in.nextLine();
		
		//Read in shift
	System.out.println("Give me a shift");
	int shift = in.nextInt();
	String output = "";
	
		//Loop through message
for (int i = 0; i < message.length(); i++) {
	char ch = message.charAt(i);
	
			//if letter is alphabetic
	if (Character.isLetter(ch)) {
				//apply shift
		char base = 'a';
		if (Character.isUpperCase(ch)) {
			base = 'A';
			
		}
		ch = (char)(ch + shift);
		
		if (Character.isLowerCase(message.charAt(i))) {
			if (ch > 'Z') {
				ch = (char)(ch - 26);
			}
			
		} else {
			if (ch > 'z') {
				ch = (char)(ch - 26);
			}
		}
	}
			//add letter to output
		output = output + ch;
	}
		//print output
	System.out.println(output);
	in.close();
		}
	}