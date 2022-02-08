package String;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(701)); // "ZY"
		System.out.println(convertToTitle(28)); // "AB"
		System.out.println(convertToTitle(1));  // "A"

	}

	/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26

AA -> 27
AB -> 28 
...

Input: columnNumber = 701
Output: "ZY"
	 */
	public static String convertToTitle(int columnNumber) {
		
		StringBuilder sb = new StringBuilder();
		
		while (columnNumber > 0) {
			columnNumber--;
			char ch  = (char) (columnNumber % 26 + 'A');
			sb.insert(0,ch);
			columnNumber = columnNumber / 26;
		}
		
		return sb.toString();
	}
}
