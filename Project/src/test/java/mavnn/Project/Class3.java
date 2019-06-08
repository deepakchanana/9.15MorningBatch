package mavnn.Project;

public class Class3 {

	public Class3() 
	{
		System.out.println("default constructor");
	}
	
	public Class3(int a) 
	{
		System.out.println("one parameteri");
	}
	public void method2()
	{
	  this.method1(); // from method2 called the method1
		System.out.println("method2");
	
		Class4 obj=new Class4();
		obj.method1(this);
		
	}
	
	public void method1()
	{
		System.out.println("method1");
	}
	
	public static void main(String[] args) 
	{
	  Class3 obj=new Class3();
	  obj.method2(); // called the method2
		
	}	
	
}
