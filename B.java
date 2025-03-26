package DeadLock;

public class B {
	public synchronized void m2(A a) {
		System.out.println("Thread 2 starts execution of m1() ");
		try {
			Thread.sleep(50);
		}catch(Exception e) {
			System.out.println(e);
		}
		a.dead();
	}
	public synchronized void dead() {
		System.out.println("Inside B , dead() ");
	}

}
