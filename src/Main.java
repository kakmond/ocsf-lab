import java.io.IOException;
import java.util.Scanner;

/**
 * Main class for run program.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */
public class Main {

	/**
	 * main method for connect to the server and run.
	 * 
	 * @param args
	 *            not used.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Client client = new Client("10.2.12.83", 5001);
		try {
			client.openConnection();
			String input = keyboard.nextLine();
			client.sendToServer(input);
			while (client.isConnected()) {
				input = keyboard.nextLine();
				if (input.equals("quit"))
					client.closeConnection();
				client.sendToServer(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}