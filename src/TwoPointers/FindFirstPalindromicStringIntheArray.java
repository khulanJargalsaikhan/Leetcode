package TwoPointers;

public class FindFirstPalindromicStringIntheArray {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[] {"pp","ghi"}));  //"pp"
        System.out.println(firstPalindrome(new String[] {"abc","car","ada","racecar","cool"})); //ada
        System.out.println(firstPalindrome(new String[] {"notapalindrome","racecar"}));  //racecar
        System.out.println(firstPalindrome(new String[] {"def","ghi"}));  //""

    }

    public static String firstPalindrome(String[] words) {
        for (String word : words){
            int start = 0;
            int end = word.length()-1;
            while (start < end){
                if (word.charAt(start++) != word.charAt(end--)){
                    break;
                }
                //if start is equal to or greater than end, that means it is palindrome
                if (start >= end) {
                    return word;
                }
            }
        }
        return "";
    }

}
