package JavaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
 
		String s = "Vijaykumar";
//		int len = s.length();
//		String re = "";
//		
//		for(int i = len-1; i>=0; i--) {
//		re= re + s.charAt(i);
//		}
//		
//		System.out.println(re);
	
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());
	
	}
		

}
