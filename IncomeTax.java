package test;
import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0 , i;
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter Income");
		int amount=s.nextInt();
		if(amount<=50000)
		{
			tax=0;
			System.out.println(" Income Tax Of Given Employee Is Nil");
		}
		else if(amount<=60000)
		{
			amount+=(amount/100)*10;
			System.out.println(" Amount to be paid is" +amount);
			
		}
		else if(amount <=150000)
		{
			amount+=(amount/100*20);
			System.out.println(" Amount to be paid is"+ amount);
			
		}
		else
		{
			amount+=(amount/100*30);
			System.out.println(" Amount to be paid is"+ amount);
			
			
		}
		
		s.close();

	}

}
