package gitBranchApp;

public class mainApp {
	public static void main(String[] args) {
		//this is the 1st version
		System.out.println("1st version");
		
		Math cMath= new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
		
		
	}


}

class Math{
	int add(int a, int b) {
		return a+b;
	}
}
