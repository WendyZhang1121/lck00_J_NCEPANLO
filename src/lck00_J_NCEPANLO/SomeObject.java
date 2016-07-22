package lck00_J_NCEPANLO;

public class SomeObject {
	
	private volatile Object lock = new Object();
	public void changeValue() { 
		synchronized (lock) {
		// ... 
		}
	}
	public void setLock(Object lockValue) { 
		lock = lockValue;
	}
}
