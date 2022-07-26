package module3;

public class RunnableThread implements Runnable{
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ": Runnable Thread.");
	}
	public static void main(String[] args) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + ": Main method Begin...");
		
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.setName("RT");
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(tName + ": Main method Ends...");
		
	}

}
