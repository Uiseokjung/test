package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket c_socket = new Socket("127.0.0.1", 8888);
			
			ServerReceive r_th = new ServerReceive();
			r_th.setSocket(c_socket);
			
			ServerSend s_th = new ServerSend();
			s_th.setSocket(c_socket);
			
			r_th.start();
			s_th.start();
			
			/*
			InputStream input_data = c_socket.getInputStream();
						
			byte[] receive = new byte[100];
			input_data.read(receive);
			
			System.out.println(new String(receive));
			
			c_socket.close();
			*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
