class A
{
	A()
	{
			System.out.println("A()");	
	}
	A(int a)
	{
			System.out.println(" A(int a )");
	}
	A(int b,int a)
	{
		System.out.println(" A(int a , int b )");
	}
	A(String  b,int a)
	{
		System.out.println(" A(String  a , int b )");
	}
}
// same const name + diff paramanter + multple times in same class is called as Construct
class Demo7
{
	public static void main(String args[])
	{
		A a = new A();
		//A a1 = new A(100);
		//A a2= new A(100,200);
		//A a3= new A("ABC",400);
		
	}
}