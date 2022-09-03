package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSend extends Thread {
	private Socket m_socket;
	
	public void run() {
		super.run();
		
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(m_socket.getOutputStream());
			String str;
			
			while(true) {
				str = buf.readLine();
				pw.println(str);
				pw.flush();
			}
		}
		catch(Exception e) {}
	}
	
	public void setSocket(Socket soc) {
		m_socket = soc;
	}
}
