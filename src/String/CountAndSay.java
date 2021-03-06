package String;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(6));
		System.out.println(countAndSay(4));

	}
	/*
	 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), 
which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of 
groups so that each group is a contiguous section all of the same character. 
Then for each group, say the number of characters, then say the character. 
To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

Input: n = 1
Output: "1"
Explanation: This is the base case.

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
	 */



	public static String countAndSay(int n) {
		if (n <= 0)
			return null;

		String result = "1";
		int i = 1;

		while (i < n) 
		{
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) 
			{
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}

			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
		return result;
	}


}

