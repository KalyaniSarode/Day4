package test;

public class SwapNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=12;
		int second =15;
		System.out.println(" **Before Swap**");
		System.out.println(" First Number =" +first);
		System.out.println(" Second Number="+second);
		
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println(" **After Swap**");
        System.out.println(" First Number="+ first);
	    System.out.println(" Second Number="+second);
	    
	} 
	

}
