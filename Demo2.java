
import java.util.Scanner;

class Emp
{
	int id,age;
	String name;
	Emp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		 id=sc.nextInt();
		System.out.println(" Enter Name : ");
		 name=sc.next();
		System.out.println(" Enter Age : ");
		 age=sc.nextInt();			
	}
}
class Manager extends Emp
{
	
	int salary=800000;
	String desig="Manager";
	Manager()
	{
	}	
	void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
}


class Tester extends Emp
{
	
	int salary=300000;
	String desig="Tester";
	Tester()
	{
	}	
	void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
}

class Dev extends Emp
{
	int salary=60000;
	String desig="Developer";
	Dev()
	{
	}	
	void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
}
class Clerk extends Emp
{
	
	int salary=20000;
	String desig="Clerk";
	Clerk()
	{	
	}	
	void display()
	{
		System.out.println(" Hi ID "+id);	
		System.out.println(" My Name : "+name);	
		System.out.println(" Hi AGE "+age);	
		System.out.println(" My Salary : "+salary);		
		System.out.println(" My Designation : "+desig);	
	}
}

public class Demo2
{
	public static void main(String args[])
	{
		int ch1=0;
		do{
			System.out.println("1) Developer");
			System.out.println("2) Clerk");
			System.out.println("3) Manager");
			System.out.println("4) Tester");

			System.out.println("3) Exit");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the choice :");
			 ch1= sc.nextInt();
		
			if(ch1==1)
			{
				Dev d = new Dev();
				d.display();
			}
			if(ch1==2)
			{
				Clerk c = new Clerk();
				c.display();
			}
			if(ch1==3)
			{
				Manager m = new Manager();
				m.display();
			}

			if(ch1==4)
			{
				Tester t = new Tester();
				t.display();
			}
			if(ch1==5)
			{
				System.out.println("Thank You");
				System.exit(0);
			}

		}while(ch1!=5);	
	}
}