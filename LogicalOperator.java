import java.util.Scanner;


public class LogicalOperator {
// && -> AND  || -> OR
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks in subject 1 : ");
		int sub1=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the marks in subject 2 : ");
		int sub2=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the marks in subject 3 : ");
		int sub3=scan2.nextInt();
		Scanner scan3=new Scanner(System.in);
		System.out.println("Enter the marks in subject 4 : ");
		int sub4=scan3.nextInt();
		Scanner scan4=new Scanner(System.in);
		System.out.println("Enter the marks in subject 5 : ");
		int sub5=scan4.nextInt();
		System.out.println("Passing percent is above 40% and each subject has marks above 33 : ");
		float percentage =((sub1+sub2+sub3+sub4+sub5)/500)*100;
		if(percentage>40 && sub1>33 && sub2>33  && sub3>33  && sub4>33  && sub5>33  )
		{
			System.out.println("You passed the exam");
		}
		else
		{
			System.out.println("You are failed!");
		}

	}

}
