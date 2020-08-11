
public class Strings {
	public static void main (String[] args) {
		String s1=args[0];
		String s2=args[1];
		String s3=args[2];
		int len1=s1.length();
		int len2=s2.length();
		int len3=s3.length();
		if (len1+len2-len3!=-1) {
			System.out.println(s3 + " is not a concatenaion.");
		}	
		else {
			if ((s1.equalsIgnoreCase(s3.substring(0, len1)) && s2.equalsIgnoreCase(s3.substring(len1+1, len3))) ||
				(s2.equalsIgnoreCase(s3.substring(0, len2)) && s1.equalsIgnoreCase(s3.substring(len2+1, len3)))) {
				System.out.println(s3 + " is a concatenaion."); 
			}
			else {
				System.out.println(s3 + " is not a concatenaion.");
				
			}
		}
	}
}
