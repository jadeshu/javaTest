package club.jadeshu.base.sxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @ClassName: Demo02 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月29日 下午10:25:56 
 * @Description:
 * 查询数据库
 * 测试Statement用法
 */
public class Demo02 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1/test?serverTimezone=GMT%2B8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement statement = conn.createStatement();
			Boolean b = statement.execute("select * from user");
			System.out.println(b);
			System.out.println("------------");
			
			ResultSet rSet = statement.executeQuery("select * from user");
			while (rSet.next()) {
				String name = rSet.getString("name");
				System.out.println(name);
			}
			
			rSet.close();
			statement.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
