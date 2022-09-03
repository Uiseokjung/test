package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerReceive extends Thread {
	private Socket m_socket;
	
	public void run() {
		super.run();
		
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));
			String str;
			
			while(true) {
				str = buf.readLine();
				System.out.println(str);
			}
		}
		catch(Exception e) {}
	}
	
	public void setSocket(Socket soc) {
		m_socket = soc;
	}
}
