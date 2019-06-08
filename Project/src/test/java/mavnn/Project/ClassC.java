package mavnn.Project;

public class ClassC 
{
 
	int a,b;  // global variable
	
	public void method1(int x,int y)
	{
		a=x;
		b=y;
	}
	public static void main(String[] args) 
	{
	  ClassC obj=new ClassC();
	  obj.method1(13,10);
	  System.out.println(obj.a);
	  System.out.println(obj.b);
		
	}
}

