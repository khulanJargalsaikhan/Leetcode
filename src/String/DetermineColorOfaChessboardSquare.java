package String;

public class DetermineColorOfaChessboardSquare {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1")); //false
        System.out.println(squareIsWhite("h3")); //true
        System.out.println(squareIsWhite("c7")); //false


    }

    public static boolean squareIsWhite(String coordinates) {
        //converting a -> 1, b -> 2 etc.
        int convert = 98 - coordinates.charAt(0);
        //adding the numbers together
        int sum = convert + coordinates.charAt(1);
        //look for a pattern (even numbers -> black/false, odd numbers -> white/true)
        if (sum % 2 == 0)
            return false;
        else
            return true;
    }
}
