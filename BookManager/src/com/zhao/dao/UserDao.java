package com.zhao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zhao.model.User;


public class UserDao {

	public User login(Connection con, User user)throws Exception {
		User resultUser = null;
		String sql = "select * from t_user where userName=? and password =?";
		//PreparedStatement 实例包含已编译的 SQL 语句。这就是使语句“准备好”。
		PreparedStatement pstmt = con.prepareStatement(sql);
		//setString是定义了字符串中第n个”?“字符的替换。
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		//用于产生单个结果集的语句，例如 SELECT 语句。 被使用最多的执行 SQL 语句的方法是 executeQuery。
		//这个方法被用来执行 SELECT 语句，它几乎是使用最多的 SQL 语句。
		//查询数据库时，返回的是一个二维的结果集
		ResultSet rs = pstmt.executeQuery();
		
		//将指针移动到当前位置的下一行。ResultSet 指针的初始位置位于第一行之前；
		//第一次调用next()方法将会把第一行设置为当前行；第二次调用next()方法指针移动到第二行，以此类推。
		//如果数据库中查询到了，才会有next，不然返回值是null
		if(rs.next()){
			resultUser=new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}
}
