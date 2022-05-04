package no.hvl.dat110.messaging;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";
	
	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[SEGMENTSIZE];
		byte[] data = message.getData();
		
		// TODO - START
		
		// Encapsulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
		
		segment[0] = (byte) data.length;
		for(int i = 0; i < data.length; i++) {
			segment[i+1] = data[i];
		}
		
		return segment;
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received data into a message
		
		byte[] info = new byte[segment[0]];
		for(int i = 0; i < info.length; i++) {
			info[i] = segment[i+1];
		}
		
		message = new Message(info);
		// TODO - END
		
		return message;
		
	}
	
}
