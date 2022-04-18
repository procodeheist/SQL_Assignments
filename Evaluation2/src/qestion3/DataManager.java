package qestion3;

public interface DataManager {
	public void read();
}
interface InMemoryManager extends DataManager{
	public void write();
}

class DiskRealmManager implements InMemoryManager{

	@Override
	public void read() {
		System.out.println("Reading DiskRealmManager");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Saving int Realm");
	}
	
}

class DiskCoreDataManager implements InMemoryManager{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading DiskCoreDataManager");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Saving int Realm");
	}
	
}

class InMemoryRealmManager implements DataManager{

	@Override
	public void read() {
		System.out.println("Reading InMemoryRealmManager");
		
	}
	
}
