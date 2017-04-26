public class ConstChain {
   //default constructor of the class
   public ConstChain(){
         System.out.println("Default constructor");
   }
   public ConstChain(String s){
         this();
    	 System.out.println("Parametrized constructor with single Argument");
   }
   public ConstChain(String s, int i){
         //It will call the constructor with String argument
    	 this("Hello"); 
    	 System.out.println("Parametrized constructor with double arguments");
   }
   public ConstChain(int i, int j, int k){
   	// It will call the constructor with (String, integer) arguments
        this("Hello", 2);
        System.out.println("Parametrized constructor with three arguments");
   }
   public static void main(String args[]){
        //Creating an object using Constructor with 3 int arguments
        ConstChain obj = new ConstChain(5,5,15);
   }
}