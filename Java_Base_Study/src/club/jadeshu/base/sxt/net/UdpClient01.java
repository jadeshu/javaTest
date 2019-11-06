package club.jadeshu.base.sxt.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class UdpClient01 {

	public static void main(String[] args) throws IOException {

		byte[] buf = "我爱你!11111".getBytes();
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length,
				new InetSocketAddress("127.0.0.1", 9999));
		DatagramSocket ds = new DatagramSocket(6666);
		
//		Scanner scanner = new Scanner(System.in);
//		while (scanner.hasNextLine()) {
//			buf = scanner.next().getBytes();
//			dPacket.setData(buf);
			ds.send(dPacket);
//		}
		
		ds.close();
	}

}
