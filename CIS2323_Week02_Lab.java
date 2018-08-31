import java.util.Scanner;
public class CIS2323_Week02_Lab {
	public static void main(String[] args){ 
		int myAge = 18;
		char mySex = 'M';
		double myHeight = 5.8;
		String name;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Hey, CIS 2323 my name is Christian");
		System.out.println("I am " + myAge + " years old,");
		System.out.println("I am a " + mySex);
		System.out.print("My height is " + myHeight + "\n");
		
		System.out.println("What is your name?");
		name = inputDevice.nextLine();
		System.out.println("Hello " + name + " welcome to class.");
	}
} 