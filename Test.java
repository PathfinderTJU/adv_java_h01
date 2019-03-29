package h01;

public class Test {
	
	public Test() {
		//TODO Auto-generated constructor
	}
	
	public static void main(String args[]) {
		
		/*
		 *Error
		 *Singleton s1 = new Singleton();
		 */
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("只有一个实例");
		}		
	}
	
}
