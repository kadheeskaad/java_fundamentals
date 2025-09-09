import java.util.*;
class Avg_Mark
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter all the marks: ");
		int sum=0;
		for(int i=0;i<5;i++)
		{
			int mark=scn.nextInt();
			sum=sum+mark;
		}
		System.out.println(sum);
		int avg=sum/5;
		if(avg<35)
			System.out.println("Additional class is required.");
	}
}