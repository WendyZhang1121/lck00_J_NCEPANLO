package lck00_J_NCEPANLO;

public class TestThread implements Runnable {
	public void run() {
		// Untrusted code
		SomeObject someObject = new SomeObject(); 
		someObject.setLock(someObject);
	}
	
}
