import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
    	int length = name.length();
        System.out.println(name.length());

        
    }

    private static void printNameCharacters( String name )
    {
        int cantidad = String.valueOf(name).length();
		for (int num = 0; num < cantidad; num++) {
			System.out.println(name.charAt(num));
		}
    }
}
