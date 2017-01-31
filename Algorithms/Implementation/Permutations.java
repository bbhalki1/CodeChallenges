public class Permutations{
	public static void main(String[] args) {
		permutate("","abcd");
	}

	private static void permutate(String perm, String word) { 
		if (word.length() == 0) { 
			System.out.println(perm + word); 
		} else { 
			for (int i = 0; i < word.length(); i++) {
				permutate(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
			}
		}
	}
}