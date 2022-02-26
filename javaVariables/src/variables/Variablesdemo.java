package variables;

public class Variablesdemo 
{
	int a=10;     
	static int b=20;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
	Variablesdemo obj=new Variablesdemo();	
	
	
System.out.println(obj.a);  //10
System.out.println(obj.b);  //20
obj.a=1000;
obj.b=2000;
System.out.println(obj.a);   //1000
System.out.println(obj.b);    //2000
Variablesdemo obj1=new Variablesdemo();	
System.out.println(obj1.a);  //10
System.out.println(obj1.b);  //2000
	}

}
