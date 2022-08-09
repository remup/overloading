import java.util.HashMap;

class A {
//	public void method1(int a, short b) {
//		System.out.println(a + "  " + b);
//	}
	public void method1(int a, int b) {
		System.out.println("two int "+a + "  " + b);
	}

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		a.method1(2, (short) 5);
//		while(true) {
//			System.out.println("inside while loop");
//		}
		//System.out.println("outside while loop");
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 23);
		System.out.println(map);
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread started");
				//Thread.currentThread().sleep(1000);
				Thread.currentThread().yield();
				//Thread.currentThread().join();
				map.put(2, 23);
				System.out.println(map);
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread2 started");
				
				
			}
		});
		t.start();
		t2.start();
		t2.yield();
		map.put(3, 23);
		map.put(4, 23);
		map.put(5, 23);
		map.put(6, 23);
		System.out.println("main "+map);
	}
}
