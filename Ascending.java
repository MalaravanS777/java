import java.util.Scanner;
import java.util.Arrays;
class Ascending
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];

		System.out.println();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
		}
		System.out.println(Arrays.toString(a));
		
	}
}