package javaPractice;

public class StringEx {

	public static void main(String[] args) {
		String s="sas";
		
		int length = s.length();
		for(int i=0;length<length/2;i++) {
		if(s.charAt(i)!= s.charAt(length)-i-1)
		System.out.println("not palindrome");
		}
		System.out.println("palindrome:"+s.toUpperCase());
		System.out.println("palindrome:"+s.toLowerCase());
System.out.println(s.toLowerCase().matches(".*[aeiou].*"));
	}
}
