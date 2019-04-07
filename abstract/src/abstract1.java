//http://www.javatpoint.com/abstract-class-in-java
abstract class bike{
	abstract void run();
		
}
	class car extends bike{
		void run(){System.out.println("running abstract");}
	}
	
	public class abstract1 {
	public static void main(String[] args) {
		bike b = new car();
		b.run();
/*
 * Bike the abstract class that contains only one abstract method run. 
 * It implementation is provided by the Honda class.
 * 
 */
	}

}
