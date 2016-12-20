package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;
import bean.Userinfo;

public class Userdao {
	private Connection conn=null;
	private PreparedStatement pst=null;
	private ResultSet rs=null;
	/*
	 * 检查用户是否登录的方法
	 */
	public String selectuser(String username){
	   String user=null;
		String sql="select username from userinfo where username=?";
		
		try {
			conn=DBUtil.getConnection();
			pst=conn.prepareStatement(sql);
			
			pst.setString(1, username);
			
			rs=pst.executeQuery();
			if(rs.next()){
				
				user=rs.getString(1);
				}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeAll(conn, pst, rs);
		}
		return user;
	}
	
}
