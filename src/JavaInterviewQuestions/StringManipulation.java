package JavaInterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
 
		
		String st = "This is the right time to talk or select the time";
		
		System.out.println(st.length());
		System.out.println(st.charAt(42));
		System.out.println(st.indexOf("s"));
		System.out.println(st.indexOf("s", st.indexOf("s")+1));
		System.out.println(st.indexOf("s", st.indexOf("s")+1)+ st.indexOf("s")+2);
		
	}

}
