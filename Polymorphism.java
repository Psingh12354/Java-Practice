import  java.lang.String;
class Bank{
	void Print(){
		System.out.println("You are in bank");
	}
}
class Bank1 extends Bank{
	void Print()
	{
		System.out.println("You are in Bank 1");
		
	}
}
class Bank2 extends Bank{
	void Print()
	{
		System.out.println("You are in Bank 2");
	}
}
class Polymorphism{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ob;
		ob=new Bank1();
		ob.Print();
		ob=new Bank2();
		ob.Print();
	}

}
