
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//import tm.*;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		//results are output to 'results.txt'
		System.out.println("Eneter a machine to use ('dtm', 'add', 'sub', 'mult'): ");
		String input = keyboard.nextLine();

		TuringMachine TM1 = MachineLibrary.EqualBinaryWords(input);
		
		
		boolean done = TM1.Run("bbbbbbbbbbb10110b1010bbbbbbbbbbbbb", false);
		if (done==true)
		{
			System.out.println("The input was accepted.");
		}
		else if (input.contentEquals("dtm"))
		{
			System.out.println("The input was rejected.");
		}
	}

}
