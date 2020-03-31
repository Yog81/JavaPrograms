package javaPrograms;

public class FactorialExample {

	public void Factorial(int num) {
		int result = 1;
		for(int i=num; i>=1; i--) {
			result = result*i;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		FactorialExample factorial = new FactorialExample();
		factorial.Factorial(5);
	}

}
