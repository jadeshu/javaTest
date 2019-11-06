package club.jadeshu.base.sxt.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpServer01 {

	public static void main(String[] args) throws IOException {

		DatagramSocket dSocket = new DatagramSocket(9999);

		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		//while (true) {
			dSocket.receive(packet);
			System.out.println(new String(packet.getData()));
		//}
		dSocket.close();
	}

}
