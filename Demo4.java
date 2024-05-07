class P 
{
	int a=1000;
}
class C  extends  P 
{
	int a =100;
	void use(int a)
	{
		System.out.println("A  :"+ a );
		System.out.println("A this ---- >"+this.a);
		System.out.println("A super---- >"+super.a);

		
	}
}
class Demo4
{
	public static void main(String args[])
	{
		C c = new C();
		c.use(10);
	}
}
