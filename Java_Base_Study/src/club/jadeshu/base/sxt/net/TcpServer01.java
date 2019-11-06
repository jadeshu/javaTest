package club.jadeshu.base.sxt.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: Server01
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午5:33:23
 * @Description:服务端
 */
public class TcpServer01 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6666);
		while (true) {
			Socket sClient = ss.accept();
			DataOutputStream dos = new DataOutputStream(
					sClient.getOutputStream());
			dos.writeUTF("hello :" + sClient.getInetAddress() + " "
					+ sClient.getPort());
			dos.flush();
			dos.close();
			sClient.close();
		}
	}
	

}
