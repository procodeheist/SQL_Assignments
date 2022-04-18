package qestion2;

public interface Bird {
	public void wings();
}

interface FlyingBird extends Bird{
	public void fly();
}

interface RunningBird extends Bird{
	public void run();
}

class Eagle implements FlyingBird{

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
class Ostrich implements RunningBird{

	@Override
	public void wings() {
		System.out.println("It has wings");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("It can run");
	}
	
}


