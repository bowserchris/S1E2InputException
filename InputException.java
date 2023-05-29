package n2E1jejercicioInput;

import java.util.InputMismatchException;

public class InputException extends InputMismatchException  {
	
	public InputException(String errorMessage) {
		super(errorMessage);
	}
	
}

/*Methods to be implemented by catching the exception of the InputMismatchException class:

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
 * 
 * 
 * */
