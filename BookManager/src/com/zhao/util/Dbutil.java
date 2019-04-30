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
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception{
		//���ز���ָ�����࣬���ҳ�ʼ����
		//����MySql����
		Class.forName(jdbcName);
		//������ݿ�����
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	//throws ���쳣�׸��������ĵط�
	public void closeCon(Connection con)throws Exception {
		if (con != null) {
			con.close();
		}
	}
}
