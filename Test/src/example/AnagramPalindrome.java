package example;
public class AnagramPalindrome {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scanner = new Scanner(System.in);
*/		String word = "uuuur";
		boolean result = is_AnagramPalindrome(word);
		
		if(result)
		{
			System.out.println("It's a anagram palindrome");
		} else {
			System.out.println("It's not a anagram palindrome");
		}
 
	}
 
	private static boolean is_AnagramPalindrome(String word) {
		int oddOccur = 0;
		int[] count = new int[256];
		
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			count[ch]++;
		}
		
		for(int cnt : count)
		{
			if(oddOccur > 1)
			{
				return false;
			}
			if(cnt%2 == 1)
			{
				oddOccur++;
			}
		}
		return true;
	}
 
}