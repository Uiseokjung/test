package network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket s_socket = new ServerSocket(8888);
			Socket c_socket = s_socket.accept();
			
			ServerReceive r_th = new ServerReceive();
			r_th.setSocket(c_socket);
			
			ServerSend s_th = new ServerSend();
			s_th.setSocket(c_socket);
			
			r_th.start();
			s_th.start();

			/*
			OutputStream output_data = c_socket.getOutputStream();
			
			String str = "Welcome to Connect";
			output_data.write(str.getBytes());
			
			s_socket.close();
			c_socket.close();
			*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
