package n2E1jejercicioInput;
import java.util.InputMismatchException;
import java.util.Scanner;

import n1E1jejercicioProduct.SalesEmptyException;

public class App {

	public static void main(String[] args) throws InputException {
		
		System.out.println("the byte returned is: " + checkByte());
		System.out.println("the int returned is: " + checkInt());
		System.out.println("the float returned is: " + checkFloat());
		System.out.println("the double returned is: " + checkDouble());
		System.out.println("the initial returned is: " + checkChar());
		System.out.println("the name returned is: " + checkString());
		System.out.println("The result to the question is: " + checkIfNo("Do you have a car? s = yes, n = no. "));
		
		
	}
	
	////input methods below///////
	
	//inputByte() input method that throws custom exception
	
	public static byte inputByte(String message) throws InputException {			//request a number input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextByte();
	}
	
	//checkByte() verification method that has try,catch block if outside of range
	
	public static byte checkByte() {
		boolean exit = false;
		byte inputNum = 0;
		do {
			try {
				//System.out.println("Entered byte try statement.");
				inputNum = inputByte("Enter your age: ");
				if (inputNum > -128 || inputNum < 127) {	//condicion para verificar que es byte
					exit = true;
				}
			} catch (InputMismatchException ie){
				System.out.println("Please enter a number for a byte range: -128 to 127.");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return inputNum;
	} 
	
	///inputInt() input method for int that throws custom exception

	public static int inputInt(String message) throws InputException {				//request a number input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextInt();
	}
	
	//checkInt() verification method that has try,catch block if outside of range
	
	public static int checkInt() {
		boolean exit = false;
		int inputNum = 0;
		do {
			try {
				//System.out.println("Entered byte try statement.");
				inputNum = inputInt("What is your birthday?");
				if (inputNum < -2147483648 || inputNum > 2147483647) {	//condicion del rango de un int
					exit = true;
				}
			} catch (InputMismatchException ie){
				System.out.println("Please, only numbers should be introduced in the following format DDMMYYYY.");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return inputNum;
	} 
	
	///inputFloat() input method for float that throws custom exception
	
	public static float inputFloat(String message) throws InputException {				//request a number input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextFloat();
	}
	
	//checkFloat() verification method that has try,catch block if wrong format
	
	public static float checkFloat() {
		boolean exit = false;
		float inputNum = 0;
		do {
			try {
				//System.out.println("Entered byte try statement.");
				inputNum = inputFloat("Enter a fractional number: ");
				if (inputNum % 1 != 0) {		//condicion para dividir el numero y ver si tiene decimales
					exit = true;
				} else {
					throw new InputException("InputMismatchException");
				}
			} catch (InputMismatchException ie){
				System.out.println("Please, only numbers should be introduced in the correct format with '.'");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return inputNum;
	} 
	
	//inputDouble() input method for double that throws custom exception
	
	public static double inputDouble(String message) throws InputException {				//request a number input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextDouble();
	}
	
	////checkDouble() verification method that has try,catch block if wrong format
	
	public static double checkDouble() {
		boolean exit = false;
		double inputNum = 0;
		do {
			try {
				//System.out.println("Entered byte try statement.");
				inputNum = inputDouble("Enter a fractional number: ");
				if (inputNum % 1 != 0) {		//condicion para dividir el numero y ver si tiene decimales
					exit = true;
				} else {
					throw new InputException("InputMismatchException");
				}
			} catch (InputMismatchException ie){
				System.out.println("Please, only numbers should be introduced in the correct format with '.'");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return inputNum;
	} 

	//input method for both character and string input
	
	public static String inputString(String message) throws InputException  {				//request a string input
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		return input.nextLine();
	}
	
	//checkChar() receives string and compares its length to determine its only 1 character
	
	public static char checkChar() {
		boolean exit = false;
		char inputChar = '*';
		do {
			try {
				//System.out.println("Entered byte try statement.");
				String initial = inputString("Enter your first initial: ");
				if (initial.length() > 1) {		//condicion para ver si el string es mas largo que 1, o sea mas de un caracter
					throw new InputException("InputException");
				} else {
					inputChar = initial.charAt(0); //si la longitud no es mas que uno entonces lo coje y asigna al tipo caracter
					exit = true;
				}
			} catch (InputException ie){
				System.out.println("Please, only introduce a single letter.");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return inputChar;
	}
	
	public static String checkString() {
		boolean exit = false;
		String inputString = "";
		do {
			try {
				//System.out.println("Entered byte try statement.");
				String initial = inputString("Enter your name: ");
				if (initial.length() <= 1) {		//condicion para ver si el string es mas largo que 1, o sea mas de un caracter
					throw new InputException("InputException");
				} else {
					inputString = initial; //si la longitud no es mas que uno entonces lo coje y asigna al tipo caracter
					exit = true;
				}
			} catch (InputException ie){
				System.out.println("Please, introduce more than a single letter.");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return inputString;
	}
	
	//public static boolean readIfNo(String message), if the user enters "s", it returns "true", if the user enters "n", it returns "false".
	
	public static boolean checkIfNo(String message) {
		boolean exit = false;
		boolean result = true;
		do {
			try {
				//System.out.println("Entered byte try statement.");
				String test = inputString(message);
				if (test.equalsIgnoreCase("s")) {		//condicion para comparar el string y devolver el resultado true
					result = true;
					exit = true;
				} else if (test.equalsIgnoreCase("n")) {
					result = false;
					exit = true;
				} else {
					throw new InputException("InputException");
				}
			} catch (InputException ie){
				System.out.println("Either input an s for yes or n for no. All other options give an error.");
				System.out.println(ie.getMessage());
			} 
		} while (!exit);
		return result;
	}


}

/*Create a class called "Input". This class must be used to control the different
 *  exceptions that may appear in Java when entering data by keyboard using the Scanner class.


The first thing to do is instantiate an object of the Scanner class and from there, 
create static methods to read the different types of data from the keyboard.

important

It is important that if an exception is raised in any method, we handle it and ask 
the user for the data again until it is properly entered. For example: If you enter 
a float with a period instead of a comma, it should show “Format Error”. Until the user 
enters a well-formed float, he/she must keep asking for the data.

All methods receive a String with the message to be displayed to the user, for example: 
"Enter your age", and return the appropriate data entered by the user in each method, 
for example: a byte with the user's age.

Methods to be implemented by catching the exception of the InputMismatchException class:

    public static byte readByte(String message);

    public static int readInt(String message);

    public static float readFloat(String message);

    public static double readDouble(String message);

Methods to implement capturing the exception of the Exception class:

    public static char readChar(String message);

    public static String readString(String message);

    public static boolean readIfNo(String message), if the user enters "s", it returns "true", if the user enters "n", it returns "false".
 * 
 * 
 * 
 */