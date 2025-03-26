package DeadLock;

public class Deadlock extends Thread{
	A a = new A();
	B b = new B();
	public void fun() {
		this.start();
		a.m1(b);
	}
	public void run() {
		b.m2(a);
	}
	public static void main(String[] args) {
		Deadlock d = new Deadlock();
		d.fun();
	}
}
