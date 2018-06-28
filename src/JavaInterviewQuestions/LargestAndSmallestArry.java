package JavaInterviewQuestions;

import java.util.Arrays;

public class LargestAndSmallestArry {

	public static void main(String[] args) {
 
		int num[] = {23, -52, 532-1, 234, 74,-44334, 345535};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
		else 
			if(num[i]<smallest) {
				smallest = num[i];
			
				}
		}
		
		System.out.println("Given number is: " + Arrays.toString(num));
		System.out.println("Largest number is:  " + largest);
		System.out.println("Smallest number is:  " + smallest);
	}
	
}
