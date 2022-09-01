package Array;

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        int count = 0;
        int stopIdx = s.length()-1;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                count++;
            }
            if (count == k){
                stopIdx = i;
                break;
            }
        }
        return s.substring(0,stopIdx);
    }
}
