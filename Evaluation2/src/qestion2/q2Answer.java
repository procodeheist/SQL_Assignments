package qestion2;
/*
 * Explain the Liscov’s Substitution principle with an example.
 * 
 * 
ANSWER:
Liscov’s Substitution principle:
Liscov's Substitution principle says that every sub class should accepted by parent class.
which means any subclass should be replaceable for its parent class. */

public class q2Answer {
	
}
interface BirdBefore {
	public void wings();
	public void fly();
}
class EagleBefore implements BirdBefore{

	@Override
	public void wings() {
		System.out.println("It has wings");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("It can fly");
	}
	
}
class OstrichBefore implements BirdBefore{

	@Override
	public void wings() {
		System.out.println("It has wings");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("error");
	}
	
}

