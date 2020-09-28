package javaPractice;

public class StringRefEx {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		String s3 = s1+ "xyz";
		
		System.out.println(s1 + " ref " + s1.hashCode());
		System.out.println(s2 + " ref1 " + s2.hashCode());
		System.out.println(s3 + " ref3 " + s3.hashCode());

	}

}
