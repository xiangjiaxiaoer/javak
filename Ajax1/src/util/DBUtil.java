package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static String DRIVER="oracle.jdbc.OracleDriver";
	private static String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private static String USER="cate";
	private static String PWD="666";
	//加载并注册驱动
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	/*
	 * 获得连接的方法
	 */
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL,USER,PWD);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return conn;
	}
	/*
	 * 关闭所有对象的方法
	 */
	
	public static void closeAll(Connection conn,Statement st,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

}
