class P 
{
	P()
	{
		System.out.println("P class ");
	}
}
class C  extends P 
{
	C()
	{
		System.out.println("C class" );	
	}
}
class C1 extends C
{
	C1()
	{
		System.out.println("C1 class ");
	}
}
class Demo5
{
	public static void main(String args[])
	{
		C1 c1 = new C1();
		
	}
}