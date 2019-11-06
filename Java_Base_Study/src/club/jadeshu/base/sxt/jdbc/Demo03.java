package club.jadeshu.base.sxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName: Demo03 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月29日 下午10:48:44 
 * @Description:
 * PreparedStatement用法
 */
public class Demo03 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1/test?serverTimezone=GMT%2B8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement ps = null;
//			ps = conn.prepareStatement("select * from user where name = ?");
//			ps.setString(1, "jayjade");
			ps = conn.prepareStatement("select * from user");
			ResultSet rSet = ps.executeQuery();
			while (rSet.next()) {
//				String id = rSet.getString("id");    // id/Id不区分大小写
//				String name = rSet.getString("name");
//				String pwd = rSet.getString("sex");
//				String bir = rSet.getString("birthday");
				
				// 用序列号获取数据
				String id = rSet.getString(1);
				String name = rSet.getString(2);
				String pwd = rSet.getString(3);
				String bir = rSet.getString(4);
				System.out.println(id+" " +"姓名:"+ name + " "+ 
							"密码:" + pwd + " " + "生日:" + bir);
			}
			
			rSet.close();
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
