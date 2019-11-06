package club.jadeshu.base.it.java.base.ch04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2017-12-12 ����5:23:13
 * ��˵��
 */
public class MyClient {

	/**
	 * @throws IOException  
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 * @return void
	 * @throws 
	 */
	public static void main(String[] args) throws IOException {
		//1,�����ͻ���  +�˿�
		DatagramSocket client = new DatagramSocket(9897);
		//2,׼������
		String msg = "UDP���";
		byte[] data = msg.getBytes();
		//3,��װ�ɰ�(���͵ĵص�Ͷ˿�)DatagramPacket(byte[] buf, int length, SocketAddress address) 
		DatagramPacket packet = new DatagramPacket(data,data.length,
				new InetSocketAddress("localhost",9898));
		//4,��������
		client.send(packet);
		//6.�ͷ���Դ
		client.close();

	}

}
