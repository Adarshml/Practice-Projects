package module3;

public class MyThread extends Thread{
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();	
	}
	
	@Override
	public void run() {
			System.out.println("Thread started running");
			
	}
	
}
