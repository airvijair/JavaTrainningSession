package JavaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
 
		String names[] ={ "Vijay", "Kumar", "Ram", "Senthil", "Vijay", "Ram"};
		
	//Compare each elements
		for(int i=0; i<names.length; i++) {
			for(int j= i+1; j<names.length; j++) {
				
				if (names[i].equals(names[j])) {
					System.out.println("Duplication element is :::" +names[i]);

				}
				
			}
		}
		
		//Using HashSet concepts
		
		Set<String> store = new HashSet<String>();
		for(String value: names) {
			if (store.add(value) == false) {
				System.out.println("Second Duplicate Element is :::  " + value);
			}
		}
		
		
	}
	
}
