package module3;

public class SyncdemoWorker implements Runnable{

	SyncdemoDisplay dm;
	String name;
	
	SyncdemoWorker(SyncdemoDisplay dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	
	@Override
	public void run() {
		dm.sayHello(name);
	}

}
