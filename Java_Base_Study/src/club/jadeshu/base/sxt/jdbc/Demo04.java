package club.jadeshu.base.sxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName: Demo03 
 * @version V1.0
 * @author: jadeshu
 * @date: 2018年12月29日 下午10:48:44 
 * @Description:
 * 批处理Batch
 * 建议用Statement，保险
 * prepareStatement预处理空间有限
 * 
 * 往数据库test里的user表格里添加20000条数据
 */
public class Demo04 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1/test?serverTimezone=GMT%2B8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			conn.setAutoCommit(false); // 手动提交
			
			long begin = System.currentTimeMillis(); 
			Statement smtm = conn.createStatement();
			for (int i = 0; i < 20000; i++) {
				smtm.addBatch("insert into user (name,sex,birthday) "
						+ "values('jade"+i+"', 666666, now())");
			}
			smtm.executeBatch();	
			conn.commit(); // 提交事务
			long end = System.currentTimeMillis();
			System.out.println("插入20000条数据耗时：" + (end-begin));
			
			smtm.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
