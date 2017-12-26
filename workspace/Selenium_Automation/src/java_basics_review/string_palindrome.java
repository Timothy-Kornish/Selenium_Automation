package java_basics_review;

public class string_palindrome {

	public static void main(String[] args) {
		String madam = "madam", palindrome = "";
		
		for (int i = madam.length() - 1; i >= 0; i--) {
			palindrome += madam.charAt(i);
		}
		if (madam.equals(palindrome)) {
			System.out.println("Palindrome test for: " + madam + " passed");
		} else {
			System.out.println("Palindrome test for: " + madam + " failed");
		}
	}

}
