package AbstractionConcept;

public abstract class Bank {
	
	//In Abstract call at least one method should be there
	//Abstract method is only prototype - no method body
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("Bank---------- Credit");
	}
	
	public void debit() {
		System.out.println("Bank----------Debit");
	}

}