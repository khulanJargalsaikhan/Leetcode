package TwoPointers;

public class ReverseWordsInaStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));  //"s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords("God Ding"));  //"doG gniD"
    }

   //brute force approach
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
}
