package com.zhao.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	private String dbUrl = "jdbc:mysql://localhost:3306/db_book";
	private String dbUserName = "root";
	private String dbPassword = "123456";
	private String jdbcName = "com.mysql.jdbc.Driver";
	
	/**
	 * db=database
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception{
		//加载参数指定的类，并且初始化它
		//加载MySql驱动
		Class.forName(jdbcName);
		//获得数据库连接
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	//throws 把异常抛给调用它的地方
	public void closeCon(Connection con)throws Exception {
		if (con != null) {
			con.close();
		}
	}
}
