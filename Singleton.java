package h01;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("创建了一个实例");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}

