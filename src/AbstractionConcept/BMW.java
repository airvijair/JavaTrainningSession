package AbstractionConcept;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW --- Start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW --- Stop");		
	}

	@Override
	public void refule() {
		System.out.println("BMW --- refule");		
	}
	
	 
}
