package test;

public class Reastau  extends Restaurant{
	public static void main(String []args) {
		Restaurant.get();
		Reastau r1=new Reastau();
		r1.show();
	}
      void show() {
    	  System.out.println(" This Restaurant is currently open");
      }
}
