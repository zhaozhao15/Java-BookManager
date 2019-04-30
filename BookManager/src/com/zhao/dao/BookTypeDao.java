package com.zhao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zhao.model.BookType;
import com.zhao.util.StringUtil;

/**
 * ͼ�����Dao��
 * data access object
 * @author zhao
 *
 */
public class BookTypeDao {
	public int add(Connection con, BookType bookType)throws Exception {
		String sql = "insert into t_bookType values(null,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		//Returns:either (1) the row count for SQL Data Manipulation Language (DML) statements
		//or (2) 0 for SQL statements that return nothing
		return pstmt.executeUpdate();
	}

	/**
	 * ��ѯͼ����𼯺�
	 * @param con
	 * @param bookType
	 * @return
	 * @throws Exception
	 */
	//����bookType��ֱ��new�������µģ����ݿ�����ж��ᱻ���أ�����ȫ����ʾ
	public ResultSet list(Connection con,BookType bookType)throws Exception{
		StringBuffer sb=new StringBuffer("select * from t_bookType");
		//��������ѯ
		if(StringUtil.isNotEmpty(bookType.getBookTypeName())){
			sb.append(" and bookTypeName like '%"+bookType.getBookTypeName()+"%'");
		}
		PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	
	/**
	 * ɾ��ͼ�����
	 * @param con
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delete(Connection con, String id)throws Exception {
		String sql = "delete from t_bookType where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		//Returns:either (1) the row count for SQL Data Manipulation Language (DML) statements or 
		//(2) 0 for SQL statements that return nothing
		return pstmt.executeUpdate();
	}
	
	/**
	 * ����ͼ�����
	 * @param con
	 * @param bookType
	 * @return
	 * @throws Exception
	 */
	public int update(Connection con, BookType bookType)throws Exception {
		String sql = "update t_bookType set bookTypeName=?,bookTypeDesc=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		pstmt.setInt(3, bookType.getId());
		return pstmt.executeUpdate();
	}
}
