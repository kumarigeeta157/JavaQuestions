package DeadLock;

public class A {
	public synchronized void m1(B b) {
		System.out.println("thread 1 start execution of m1() ");
		try {
			Thread.sleep(40);
		}catch(Exception e) {
			System.out.println(e);
		}
		b.dead();
	}
	synchronized void dead() {
		System.out.println("inside A , dead()");
		
	}
	

}
