package Thread;
class MyClass extends Thread{

	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId() +" Value "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	// if this time is not full fill than this condition will apply
	}
	
}
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob=new MyClass();
		ob.start(); // use this start to run the value of thread
		MyClass ob1=new MyClass();
		ob1.start();
		

	}

}
