import java.util.Scanner;
public class Week3 {

	public static void main(String[] args) {
		
	//printExercise1();
	//printExercise2();
	//printExercise3();
	//printExercise4();
	//printExercise22();
	//printExercise27();
	//printExercise25();
	//printExercise12();
	//printExercise33();
	//printExercise20();
	
	}
	
	public static void printExercise1() {
		Scanner sc = new Scanner (System.in);
	    System.out.print("Your name: ");
	    String name = sc.next();
	    System.out.println();
	    System.out.println("Hello \n"+name);	
	    sc.close();
	}
	

	public static void printExercise2() {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("First number: ");
	    int num1 = sc.nextInt();
	    System.out.print("Second number: ");
	    int num2 = sc.nextInt();
	    int sum = num1 + num2;
	    System.out.println();
	    System.out.println("Sum: "+sum);
	    sc.close();
	  }
	
	
	public static void printExercise3() {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("First number: ");
	    int a = sc.nextInt();
	    System.out.print("Second number: ");
	    int b = sc.nextInt();
	    int d = (a/b);
	    System.out.println();
	    System.out.println("The division of a and b is:" +d);
	    sc.close();
	  }
	
	
	
	public static void printExercise4() {
		   int w = -8 + 10 * 8;
		   int x = (55 + 9) % 9;
		   int y = 20 + (-3 * 5 / 8);
		   int z = 10 + 16 / 3 * 2 - 8 % 3;

		   System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
	  }
	
	
	 public static void printExercise22() {
		 Scanner sc = new Scanner(System.in);
		 long binaryNumber, decimalNumber=0, j=1, remainder;
		 System.out.print("Input a binary number: ");
		 binaryNumber = sc.nextLong();
		 while (binaryNumber != 0) 
	  {
		 remainder = binaryNumber % 10;
		 decimalNumber = decimalNumber + remainder * j;
		 j = j * 2;
		 binaryNumber = binaryNumber / 10;
	  }
		 System.out.println("Decimal Number: " + decimalNumber);
		 sc.close();
	  }
	
	
	 public static void printExercise27(){
	       String octal_num, hex_num;
	       int decnum;
	       Scanner sc = new Scanner(System.in);
			
	       System.out.print("Input a octal number : ");
	       octal_num = sc.nextLine();
			
	       decnum = Integer.parseInt(octal_num, 8);
	       hex_num = Integer.toHexString(decnum);
			
	       System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
	       sc.close();
	 }
	 
	 
	 public static void printExercise25(){
	     Scanner sc = new Scanner(System.in);
	     long octal_num, decimal_num = 0;
	     int i = 0;
	     System.out.print("Input any octal number: ");
	    octal_num = sc.nextLong();
	    while (octal_num != 0) 
	     {
	      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
	      octal_num = octal_num / 10;
	     }
	    System.out.print("Equivalent decimal number: " + decimal_num+"\n");
	    sc.close();
	 }
	 
	 
	 public static void printExercise12() {
		  Scanner sc = new Scanner(System.in);  
		  System.out.print("Input first number: ");
		  int num1 = sc.nextInt(); 
		  System.out.print("Input second number: ");
		  int num2 = sc.nextInt();   
		  System.out.print("Input third number: ");
		  int num3 = sc.nextInt(); 
		  System.out.print("Input fourth number: ");
		  int num4 = sc.nextInt();
		  System.out.print("Enter fifth number: ");
		  int num5 = sc.nextInt();
		  System.out.println("Average of five numbers is: " + 
		   (num1 + num2 + num3 + num4 + num5) / 5);
		  sc.close();
		 }
	 
	 
	  public static void printExercise33() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input an integer: ");
	        long n = sc.nextLong();
	        System.out.println("The sum of the digits: " + sumDigits(n));
	        sc.close();
	      }
	     public static int sumDigits(long n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	      }
	     return sum;
	    }
	 
	    
	    public static void printExercise20() {
	       int dec_num, rem;
	       String hexdec_num="";   
	        /* hexadecimal number digits */
           char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
           Scanner sc = new Scanner(System.in);
           System.out.print("Input a decimal number: ");
	       dec_num = sc.nextInt();
            while(dec_num>0)
	      {
	           rem = dec_num%16;
	           hexdec_num = hex[rem] + hexdec_num;
	           dec_num = dec_num/16;
	     }
	         System.out.print("Hexadecimal number is : "+hexdec_num+"\n"); 
	         sc.close();
	     }
	    
	    
}
