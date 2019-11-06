package club.jadeshu.base.sxt.net;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @ClassName: Client01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午5:33:23 
 * @Description:客户端
 */
public class TcpClient01 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket();
		byte[] buf = new byte[256];
		int len = 256;
		buf[0] = (byte) (len & 0x000000ff);
		buf[1] = (byte) ((len & 0x0000ff00) >>8);
		buf[2] = buf[4] = 1;
		
		
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		DataOutputStream dos = new DataOutputStream(baos);
//		dos.writeShort(256);
//		dos.writeShort(1);
//		dos.writeShort(1);
//		dos.writeInt(250);
//		String str = "sjdjaksdjsjkdjaksdjksjdkajsdsdjasd";
//		dos.writeBytes(str);
		
		String str = "sjdjaksdjsjkdjaksdjksjdkajsdsdjasd";
		byte[] strbuf = str.getBytes();
		for (int i = 0; i < strbuf.length; i++) {
			buf[i+10] = strbuf[i];
		}
		//data_buf[0] = (unsigned char)((*pkg_len) & 0x000000ff);
		//data_buf[1] = (unsigned char)(((*pkg_len) & 0x0000ff00) >> 8);

		s.connect(new InetSocketAddress(InetAddress.getByName("127.0.0.1"),6666));
		OutputStream outS = s.getOutputStream();
        outS.write(buf);
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		 
		short leng = dis.readShort();
		short stype = dis.readShort();
		short ctype = dis.readShort();
		
		System.out.println(leng + "---" + stype + "---" + ctype + "---" );
		System.out.println(getUnsignedShort(leng) + "---" + getUnsignedShort(stype) + "---" + getUnsignedShort(ctype) + "---" );
		int tag = dis.readInt();
		
		System.out.println(dis.readUTF());
		dis.close();
		s.close();
	}
	
	public static int getUnsignedShort (short data){      //将data字节型数据转换为0~255 (0xFF 即BYTE)。
			return data&0x0FFFF; // 部分编译器会把最高位当做符号位，因此写成0x0FF.
		}

}
