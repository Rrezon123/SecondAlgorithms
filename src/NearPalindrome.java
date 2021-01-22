import java.util.*;

public class NearPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str=input.nextLine();
		
		if (isPalindrome(str) == true) {
			System.out.println("PALINDROME");
		} else if (isNearPalindrome(str) == true) {
			System.out.println("NEAR PALINDROME");
		} else {
			System.out.println("NONE");
		}

	}

	public static boolean isPalindrome(String s) {
		//with recursion check if it is palindrome a word
		if (s.length() <= 1)
			return true;
		else if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		else
			return (isPalindrome(s.substring(1, s.length() - 1)));
	}

	public static boolean isNearPalindrome(String s) {
		//check if the number of letters is odd so it's not a palindrome
		Set<Character> letters = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (!letters.remove(c)) {
				letters.add(c);
			}
		}
		return letters.size() <= 1;
	}

}
