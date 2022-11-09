import java.util.*;
public class FirstQuestion {

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
		String c = Arrays.toString(a);
		System.out.println(c);
		
		for (int j=0;j<n;j++)
		{
			for (int k=j+1;k<n;k++)
			{
				if(a[j]==a[k])
				{
					System.out.println("duplicate elements found");
					return;
					
				}
				
			}
		}System.out.println("duplicates not found");
		
	
	}
	
			
		
		
	
		
		
		
		

	}


