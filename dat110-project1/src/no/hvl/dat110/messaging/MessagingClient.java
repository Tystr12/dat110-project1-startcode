package no.hvl.dat110.messaging;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import no.hvl.dat110.TODO;

public class MessagingClient {
	
	private String server;
	private int port;
	
	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	// connect to messaging server
	public Connection connect () {
			
		Socket clientSocket;
		Connection connection = null;
		
		// TODO - START
		// create TCP socket for client and connection
		// forst�r ikke ka vi skal her...
		
		try {
			// ?
			ServerSocket socket = new ServerSocket(port);
			Socket conn = socket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// TODO - END
		return connection;
	}
}
