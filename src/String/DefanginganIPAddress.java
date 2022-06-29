package String;

public class DefanginganIPAddress {
    public static void main(String[] args){
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr2("1.1.1.1"));
    }

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/


    public static String defangIPaddr(String address) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        return sb.toString();
    }

    public static String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }
}
