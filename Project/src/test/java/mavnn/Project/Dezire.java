package mavnn.Project;

public class Dezire  extends Maruti
{
	
	public void method4()
	{
		System.out.println("I am Child method");
	}

	public static void main(String[] args) {
		Dezire d=new Dezire();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
		
		
	}
}
