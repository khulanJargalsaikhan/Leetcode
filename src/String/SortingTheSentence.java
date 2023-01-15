package String;

public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3")); //This is a sentence
    }
    public static String sortSentence(String s) {
        //Divide the string into the words as an array of strings
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        for (String elem : arr) {
            int index = elem.charAt(elem.length() - 1) - '0';
            //System.out.println(index);
            //Sort the words by removing the last character from each word and sorting according to it
            result[index - 1] = elem.substring(0, elem.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++){
            if (i < result.length - 1)
                sb.append(result[i]).append(" ");
            else
                sb.append(result[i]);
        }
        return sb.toString();
    }
}
