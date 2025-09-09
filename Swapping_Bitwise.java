import java.util.*;
class Swapping_Bitwise
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=scn.nextInt();
		int b=scn.nextInt();

		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("New value of a = " +a);
		System.out.println("New value of b = "+b);

	}

}