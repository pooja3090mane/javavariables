package scopeofInstanceVariable;

public class Abc {
	int a=10;      //instance variable
	static int b=20;   //static variable
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Abc ob1=new Abc();
		//System.out.println(a);
		System.out.println(ob1.a);
		System.out.println(b);
		System.out.println(ob1.b);
		
//instance variables have scope inside all methods,variables,and constructors within class 
	//but not inside static method directly.
	}

}
