
public class Fibonacci {
	public static void main(String[] args){
		
		int number = 31;
		int output = fib(number-1);
		System.out.println("Fibonacci number " + number + " is :" + output);
		
		collatz(number);
	}
	
	
	public static int fib(int i){
		if(i<=1)return 1;
		return fib(i-1) + fib(i-2);
	}
	
	public static void collatz(int i){
		System.out.println("Calling collatz of " + i);
		if(i==1)return;
		else if(i%2==0)collatz(i/2);
		else collatz(i*3+1);
	}
	
}
