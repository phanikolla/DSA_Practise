import java.io.*; 

class CountSetBits { 
	/* Function to get no of set 
	bits in binary representation 
	of positive integer n */
	static int countSetBits(int n) 
	{ 
		int count = 0; 
    	while (n != 0) {
	      if (n % 2 != 0)
	        count++;
	      n = n/2;      
	    } 
	    return count; 
	} 

	// driver program 
	public static void main(String args[]) 
	{ 
		int i = 9; 
		System.out.println(countSetBits(i)); 
	} 
}
