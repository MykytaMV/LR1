package myshnov;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	private int amountofnumbers;
	private List<Long> fibonacciNumbers = new ArrayList<>();
	
	public Fibonacci(int amountofnumbers) {
		if (amountofnumbers < 0) {
			amountofnumbers = -amountofnumbers;
		}
		this.amountofnumbers = amountofnumbers;
		createFibonacciNumbers(this.amountofnumbers);
	}
	
	private void createFibonacciNumbers(int aon) {
		if (aon <= 2) {
			int counter = aon;
			while(counter > 0) {
				fibonacciNumbers.add((long) 1);
				counter--;
			}
		}else {
			fibonacciNumbers.add((long) 1);
			fibonacciNumbers.add((long) 1);
			
			while(fibonacciNumbers.size() < aon) {
				int i = fibonacciNumbers.size();
				Long p1 = fibonacciNumbers.get(i-2);
				Long p2 = fibonacciNumbers.get(i-1);
				fibonacciNumbers.add(p1 + p2);
			}
		}
	}
	
	public long getFibonacciNumber(int i) {
		if(i<0 || i>=amountofnumbers) {
			return 0;
		}else {
			return fibonacciNumbers.get(i);
		}
	}
	
	public void printFibonacciNumbers() {
        System.out.println("Всі числа Фібоначчі заданої кількості -> " + fibonacciNumbers);
    }

}
