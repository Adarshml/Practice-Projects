package module3;

public class Syncdemo {
	
	public static void main(String[] args) {

		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin");

		SyncdemoDisplay dm = new SyncdemoDisplay();

		Thread t1 = new Thread(new SyncdemoWorker(dm, "Steve"));
		t1.setName("t1");

		Thread t2 = new Thread(new SyncdemoWorker(dm, "Max"));
		t2.setName("t2");

		Thread t3 = new Thread(new SyncdemoWorker(dm, "Smith"));
		t3.setName("t3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println(tname + ": Main method end");

	}

}
