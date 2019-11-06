package club.jadeshu.base.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: DataIO01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018-12-22 上午3:04:16 
 * @Description:
 * DataInputStream
 * DataOutputStream
 */
public class DataIO01 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeBoolean(true);
		dos.writeDouble(0.2);
		dos.flush();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		DataInputStream dis = new DataInputStream(bais);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
	}

}
