
import java.io.*;
import java.util.*;

class EfficientDivisors {

	
	static void printDivisors(int n)
	{
		for(int i=1; i*i <= n; i++)
		{
			if(n % i == 0)
			{
				System.out.print(i+" ");

				if(i != n / i)
					System.out.print((n / i)+" ");					
			}
		}
	}

	public static void main (String[] args) {
		
		int n = 25;

		printDivisors(n);

	}
}
