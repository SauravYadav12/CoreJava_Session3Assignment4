class UsingStatic { 
		static int a=3;   // 1. a is set to 3
		static int b; 
	static void calc(int x) {   
		System.out.println("x = " + x); 
		System.out.println("a = " + a); 
		System.out.println("b = " + b); 
	} 
  
	static {     // 2. Static block will load first and a will be printed.
		System.out.println("Static block initialized."); 
		b = a * 4;    // 3. B will be initialized and assigned the value 12 
	} 
	public static void main(String args[]) { 
		calc(42);   // 4. Then calc method will be called.
	} 
  
} 