package example;

public class SwapStringWithoutThirdVar {
	
	public static void main(String[] args) {
		
		String a="Avinash";
		String b="Nagarsoge";
		
		System.out.println("Before swap : a = "+a+" and b = "+b);
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		
		 System.out.println("\nAfter swap: a = "+a+" andd b = "+b); 
		
	}

}
