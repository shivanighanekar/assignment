package pkj;

public class Conditional_operator {
	public static void main(String[] args) {
		
		/// AND operator
		char gender='M';
		int age=12;
		
		//both condition should be satisfied 
		if(gender=='M' && age>=12)
		{
			System.out.println("Full ticket");
		}
		
		///OR operator
		
		int a=10;
		int b=20;
		int c=30;
		if(a>5 || b==20)
		{
			System.out.println(a+b);
		}
		

		
	}

}
