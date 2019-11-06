package club.jadeshu.base.it.java.base.ch04;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author jadeshu  QQ:70381915
 * @version V1.0
 * @data:2017-12-12 ����4:21:54
 * ����InetAddress��ϰ
 */
public class Demo04 {

	/**
	 * @throws UnknownHostException 
	 * @throws UnknownHostException  
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 * @return void
	 * @throws 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strHostAddr = addr.getHostAddress();
		//InetAddress.getByAddress("192.168.0.101");
		System.out.println(strHostAddr);
		strHostAddr = addr.getHostName();
		
		System.out.println(strHostAddr);
		
		System.out.println("------------------------");
		
		InetSocketAddress sAddr = new InetSocketAddress("127.0.0.1",9898);
		System.out.println(sAddr.getHostName());
		System.out.println(sAddr.getPort());
	}

}
