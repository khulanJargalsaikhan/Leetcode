package String;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
		System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
		System.out.println(licenseKeyFormatting("--a-a-a-a--", 2));
	}

	public static String licenseKeyFormatting(String s, int k) {
		String str = s.replace("-", "");
		StringBuilder sb = new StringBuilder();
		int count = 0;

		for (int i=str.length()-1; i>=0; i--){
			if (str.charAt(i) != '-') {
				sb.append(str.charAt(i));
				count++;
			}
			if ( count == k && i != 0) {
				sb.append("-");
				count = 0;
			}
		}
		return sb.reverse().toString().toUpperCase();
	}

}
