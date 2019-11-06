package club.jadeshu.base.sxt.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @ClassName: Demo01 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月29日 下午9:33:25 
 * @Description:
 * 测试跟数据库建立连接
 */
public class Demo01 {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    //String url = "jabc:mysql://127.0.0.1:3306/test";
	    String url = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false";
		Connection conn = DriverManager.getConnection(
				url, 
				"root", "root");
		System.out.println(conn);
		conn.close();
	}
}
