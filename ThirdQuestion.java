import java.util.*;
public class ThirdQuestion {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scan.nextInt();
		
		int [] a = new int [n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the value of" + i);
			a[i] = scan.nextInt();
		}
		//array print
		String c = Arrays.toString(a);
		System.out.println("array" + c);
		
		for (int j=0;j<n;j++)
		{
			for (int k=j+1;k<n;k++)
			{
				if(a[j]>a[k])
				{
					int temp = a[j];
					a[j]=a[k];
					a[k]=temp;
				
				}
				
			}
		}System.out.println();
		for(int elem:a) 
		{
			System.out.print(elem+ " ");
		}
		
	
	}
	
			
		
		
	
		
		
		
		

	}


