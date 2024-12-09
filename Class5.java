package pkj;

public class Class5 {
	
	 void Addition() {
		
		System.out.println("its non static method");
	}
	public static void main(String[] args) {
		System.out.println("its main method");
		Class5 a=new Class5();
		a.Addition();
	}

}
