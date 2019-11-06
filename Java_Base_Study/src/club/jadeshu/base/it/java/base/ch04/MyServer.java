package club.jadeshu.base.it.java.base.ch04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2017-12-12 ����5:23:01
 * ��˵��
 */
public class MyServer {

	/**
	 * @throws IOException 
	 * @throws SocketException  
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 * @return void
	 * @throws 
	 */
	public static void main(String[] args) throws IOException {
		//1,���������  +�˿�
		DatagramSocket server = new DatagramSocket(9898);
		//2,׼����������
		byte[] container = new byte[1024];
		//3,��װ�ɰ�DatagramPacket(byte[] buf, int length)
		DatagramPacket packet = new DatagramPacket(container,container.length);
		//4,��������
		server.receive(packet);
		//5.������Դ
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data,0,len));
		//6.�ͷ���Դ
		server.close();
	}

}
