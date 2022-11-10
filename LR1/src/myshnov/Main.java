package myshnov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Введіть кількість перших чисел Фібоначчі: ");
	    int num = scan.nextInt();
	    scan.close();
	    Fibonacci F = new Fibonacci(num);
	    F.printFibonacciNumbers();
	    
	    List<Long> outp = new ArrayList<>();
	    long itn = 1;
	    for(int i = 0; i < num; i++) {
	    	while(F.getFibonacciNumber(i) > TriangleNumbers(itn)){
	    		itn++;
	    	}
	    	if(F.getFibonacciNumber(i) == TriangleNumbers(itn)) {
	    		outp.add(F.getFibonacciNumber(i));
	    	}
	    	
	    }
	    System.out.print("Відповідь: " + outp);
    
    }
	
	private static long TriangleNumbers(long i) {
		return i*(i+1)/2;
	}
}
