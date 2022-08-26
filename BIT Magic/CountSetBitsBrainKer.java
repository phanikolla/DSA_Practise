import java.io.*; 

class CountSetBitsBrainKer { 
	/* Function to get no of set 
	bits in binary representation 
	of passed binary no. */
	static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n > 0) { 
			n &= (n - 1); 
			count++; 
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
