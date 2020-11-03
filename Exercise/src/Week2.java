import java.util.Scanner;
public class Week2 {

	public static void main(String[] args) {

	//printex1();
	//printex2();
	//printex3();
	//printex4();
	//printex5();
	//printex6();
	//printex7();
	printex8();
	//printex9();
	//printex10();
	
		
	}
		
	public static void printex1() {

	        Scanner sc = new Scanner(System.in);
	        System.out.print ("Input a temp in Fahrenheit: ");
	        double fahrenheit = sc.nextDouble();
	        double  celsius =((5 *(fahrenheit - 32.0)) / 9.0);
	        System.out.println(fahrenheit + "is equal to " + celsius );
	        sc.close();
	}
	
	
	public static void printex2() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for inch: ");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
        sc.close();
	}
	
	
	  public static void printex3() {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer between 0 and 1000: ");
	        int num = sc.nextInt();
	        int first = num % 10;
	        int remaining = num / 10;
	        int second = remaining % 10;
	        remaining = remaining / 10;
	        int third = remaining % 10;
	        remaining = remaining / 10;
	        int fourth = remaining % 10;
	        int sum = third + second + first + fourth;
	        System.out.println("The sum of all digits in " + num + " is " + sum);
	        sc.close();
	  }
	  
	  
	  public static void printex4() {

	        Scanner sc = new Scanner(System.in);
	        
	        double minutesInYear = 60 * 24 * 365;
	        System.out.print("Input the number of minutes: ");
	        int min = sc.nextInt();
	        int years = (int) (min / minutesInYear);
	        int days = (min / 60 / 24) % 365;

	        System.out.println( min + " minutes is approximately " + years + " years and " + days + " days");
	        sc.close();
	  }
	
	
	  public static void printex5() {

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter time zone offset to GMT: ");
	        long timeZoneChange = sc.nextInt();
	        long tmilliseconds = System.currentTimeMillis();
	        long tseconds = tmilliseconds / 1000;
	        long csecond = tseconds % 60;
	        long tminutes = tseconds / 60;
	        long cminute = tminutes % 60;
	        long thours = tminutes / 60;
	        long chour = ((thours + timeZoneChange) % 24);
	        System.out.println("Current time is " + chour + ":" + cminute + ":" + csecond);
	        sc.close();
	  }
	  
	  
	  public static void printex6() {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter weight in pounds: ");
	        double weight = sc.nextDouble();
	        System.out.print("Entert height in inches: ");
	        double inches = sc.nextDouble();
	        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
	        System.out.print("BMI: " + BMI);
	        sc.close();
	    }
	
	
	  public static void printex7() {
			Scanner sc = new Scanner(System.in); 

			float timeSeconds;
			float mps,kph, mph;

			System.out.print("Enter distance in meters: ");
			float distance = sc.nextFloat();

			System.out.print("Enter hour: ");
			float hr = sc.nextFloat();

			System.out.print("Enter minutes: ");
			float min = sc.nextFloat();

			System.out.print("Enter seconds: ");
			float sec = sc.nextFloat();

			timeSeconds = (hr*3600) + (min*60) + sec;
			mps = distance / timeSeconds;
			kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
			mph = kph / 1.609f;

			System.out.println("Your speed in m/s: "+mps);
			System.out.println("Your speed in km/h: "+kph);
			System.out.println("Your speed in miles/h: "+mph);
			sc.close();
		}
	  
	  
	  public static void printex8()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value: ");
	        double val = sc.nextDouble();
	        
	        double square = Math.pow(val,2);
	        double cube = Math.pow(val,3);
	        double four = Math.pow(val,4);
	        
	        System.out.printf("Square: "+square);
	        System.out.printf("Cube: "+cube);
	        System.out.printf("Fourth power: "+four);
	        sc.close();
	    }
	  
	  
	  public static void printex9() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter first integer: ");
	        int firstInt = sc.nextInt();
	        System.out.print("Enter second integer: ");
	        int secondInt = sc.nextInt();
	        
	        double sum = firstInt + secondInt;
	        double diff = firstInt - secondInt;
	        double product = firstInt * secondInt;
	        double average = (firstInt + secondInt) / 2;
	        double distance = Math.abs(firstInt - secondInt);
	        double max = Math.max(firstInt, secondInt);
	        double min =Math.min(firstInt, secondInt);

	        System.out.printf("Sum of two integers: " + sum);
	        System.out.printf("Difference of two integers: " + diff);
	        System.out.printf("Product of two integers: " + product);
	        System.out.printf("Average of two integers: " + average);
	        System.out.printf("Distance of two integers: " + distance);
	        System.out.printf("Max integer: " + max);
	        System.out.printf("Min integer: " + min);
	        sc.close();
	    }
	  
	  
	  public static void printex10(){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter six non-negative digits: ");
	        int input = sc.nextInt();
	        int n1 = input / 100000 % 10;
	        int n2 = input / 10000 % 10;
	        int n3 = input / 1000 % 10;
	        int n4 = input / 100 % 10;
	        int n5 = input / 10 % 10;
	        int n6 = input % 10;
	      System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5 + "\n" + n6);
	      sc.close();
	  }
	  
	
}
