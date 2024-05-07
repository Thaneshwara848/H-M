<<<<<<< HEAD
class P 
{
	int money = 200000;
	String car= "bmw";
	String newcar= "BENZ";
	int site = 5; 
	
	void use()
	{
		System.out.println("Money "+money);
		System.out.println("CAr :"+car);
		System.out.println("Site :"+site);
	}
}
class C  extends  P 
{
	int money =10000;
	void use()
	{
		System.out.println("Money :"+ money);
		System.out.println(" Parent Money :"+ super.money);
		System.out.println(" Parent Car :"+ car);
		System.out.println(" Parent Site :"+ site);
		System.out.println(" Parent New Car  :"+ newcar);

	}
}
class Demo3
{
	public static void main(String args[])
	{
		C c = new C();
		c.use();
	}
}
=======
class Demo3
>>>>>>> f7ce5fb119ad0097e8029bdb8f2b1125ba5cb489
