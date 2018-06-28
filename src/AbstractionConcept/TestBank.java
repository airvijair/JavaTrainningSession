package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {

		IciciBank ib = new IciciBank();
		ib.loan();
		ib.credit();
		ib.debit();
		ib.MutualFund();
		
		//Dynamic polymorphism 
		
		Bank b = new IciciBank();
		b.credit();
		b.debit();
		b.loan();
	
	}

}
