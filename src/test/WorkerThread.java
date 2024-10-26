package test;

public class WorkerThread extends Thread{
	
	private volatile boolean running = true;

	@Override
	public void run() {
		while(running) {
			System.out.println("runnning....");
		}
	}
	
	public void stopThread() {
		running = false;
	}
	
	

}
