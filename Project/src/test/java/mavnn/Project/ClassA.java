package mavnn.Project;

public class ClassA
{
   public void methodA()
   {
	   System.out.println("I am ClassA method");
   }
   
   public void methodB()
   {
	   System.out.println("I am ClassA method");
   }
   public void methodC()
   {/*
	   ClassB ob=new ClassB();
	   ob.method1(this);*/
	   System.out.println(this);
   }
   
   public static void main(String[] args) 
   {
	ClassA obj=new ClassA();
	obj.methodC();
	System.out.println(obj);
	   
   }
   
}
