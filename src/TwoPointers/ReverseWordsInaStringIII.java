package TwoPointers;

public class ReverseWordsInaStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));  //"s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords("God Ding"));  //"doG gniD"

        System.out.println(reverseWords2("Let's take LeetCode contest"));  //"s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords2("God Ding"));  //"doG gniD"
    }

   //brute force approach time: O(n)
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        //lastSpaceIndex will be updated everytime we find the space
        int lastSpaceIndex = -1;
        for (int i=0; i < s.length(); i++){
            //finding reverseIndex (starting index in reverse order)
            if (s.charAt(i) == ' ' || i == s.length()-1){
                //reverseIndex will be our word's last index
                int reverseIndex = (i == s.length()-1) ? i : i-1;
                for (; reverseIndex > lastSpaceIndex; reverseIndex--){
                    //copy over all the char in reverse order until reverseIndex reaches lastSpaceIndex
                    result.append(s.charAt(reverseIndex));
                }
                //after appending all chars in reverse order,
                //we should add space if we did not reach the end of the string input
                if (i != s.length()-1){
                    result.append(' ');
                }
                //for the next word, we need to reverse the chars until it reaches lastSpaceIndex,
                //so that we update lastSpaceIndex with recent space index
                lastSpaceIndex = i;
            }
        }
        return result.toString();
    }

    //reverse a string using a two-pointer approach
    public static String reverseWords2(String s) {
        char[] strArr = s.toCharArray();
        int lastSpaceIndex = -1;
        for (int i=0; i<s.length(); i++){
            if (strArr[i] == ' ' || i == s.length()-1){
                //endIndex will be different for the last word
                int endIndex = s.charAt(i) == ' ' ? i-1 : i;
                int startIndex = lastSpaceIndex + 1;
                //Find the start and end index of every word given by startIndex and endIndex.
                //Swap the characters in the word pointed by startIndex and endIndex.
                //Increment startIndex by 1 and decrement endIndex by 1.
                while (startIndex < endIndex){
                    char temp = strArr[startIndex];
                    strArr[startIndex] = strArr[endIndex];
                    strArr[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                lastSpaceIndex = i;
            }
        }
        return new String(strArr);
    }

}
