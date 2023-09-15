import java.util.*;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0,avg=0;
		int[] a=new int[100];
		System.out.println("Enter Total Number of Subjects=");
		n=sc.nextInt();
		System.out.println("Enter Total Marks of All Subjects=");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		

	    }
	for(i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("Sum of all subjects marks="+sum);
	
	avg=(sum)/n;
	System.out.println("Average Marks="+avg);
	if(avg<35)
	{
		System.out.println("Fail");
		
	}
	else if(avg>40 && avg<=50)
	{
		System.out.println("Grade=D");
	}
	else if(avg>50 && avg<=65)
	{
		System.out.println("Grade=C");
	}
	else if(avg>65 && avg<=80)
	{
		System.out.println("Grade=B");
	}
	else if(avg>80 && avg<=100)
	{
		System.out.println("Grade=A");
	}
	}
	

}
