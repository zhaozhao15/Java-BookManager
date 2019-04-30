package com.zhao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zhao.model.User;


public class UserDao {

	public User login(Connection con, User user)throws Exception {
		User resultUser = null;
		String sql = "select * from t_user where userName=? and password =?";
		//PreparedStatement ʵ�������ѱ���� SQL ��䡣�����ʹ��䡰׼���á���
		PreparedStatement pstmt = con.prepareStatement(sql);
		//setString�Ƕ������ַ����е�n����?���ַ����滻��
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		//���ڲ����������������䣬���� SELECT ��䡣 ��ʹ������ִ�� SQL ���ķ����� executeQuery��
		//�������������ִ�� SELECT ��䣬��������ʹ������ SQL ��䡣
		//��ѯ���ݿ�ʱ�����ص���һ����ά�Ľ����
		ResultSet rs = pstmt.executeQuery();
		
		//��ָ���ƶ�����ǰλ�õ���һ�С�ResultSet ָ��ĳ�ʼλ��λ�ڵ�һ��֮ǰ��
		//��һ�ε���next()��������ѵ�һ������Ϊ��ǰ�У��ڶ��ε���next()����ָ���ƶ����ڶ��У��Դ����ơ�
		//������ݿ��в�ѯ���ˣ��Ż���next����Ȼ����ֵ��null
		if(rs.next()){
			resultUser=new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}
}
