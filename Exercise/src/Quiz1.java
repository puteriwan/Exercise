import java.util.Scanner;
public class Quiz1 {

	 public static void main(String[] Strings) {

	        Scanner sc=new Scanner(System.in);
	        
	        int feet, inches, totalinch, weight, female, male;

	        System.out.println("Enter height in feet and inches,");
	        System.out.print("Feet: ");
	        feet = sc.nextInt();

	        System.out.print("Inches: ");
	        inches = sc.nextInt();

	        System.out.print("Enter weight in kg: ");
	        weight = sc.nextInt();
	        
	        totalinch = inches+((feet-5)*12);
	        
	        female = weight + (5*totalinch);
	        male = weight + (6*totalinch);
	        
	        System.out.println("Ideal weight for female: "+female);
	        System.out.print("Ideal weight for male: "+male);
	        
	    }
   }