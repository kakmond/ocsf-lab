import com.lloseng.ocsf.client.AbstractClient;

/**
 * Client class that extends AbstractClient to connect to a server and
 * send/receive objects.
 * 
 * @author Wongsathorn Panichkurkul
 *
 */
public class Client extends AbstractClient {

	/**
	 * Constructor for initialize by host and port.
	 * 
	 * @param host
	 *            is host name or IP address.
	 * @param port
	 *            is the port number.
	 */
	public Client(String host, int port) {
		super(host, port);
	}

	/**
	 * For handle messages from the server.
	 */
	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println(msg);
	}

	/**
	 * The connectionClosed will be called after connectionException if the
	 * exception causes the end of the thread.
	 */
	@Override
	public void connectionClosed() {
		System.out.println("Closed!");
	}

	/**
	 * The connectionClosed will be called when connecting to the server.
	 */
	protected void connectionEstablished() {
		System.out.print("You are connecting to server : " + this.getHost());
	}

}