package com.revature.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.config.ConnectionFactory;
import com.revature.config.DatabaseConnection;
import com.revature.service.Login;
import com.revature.model.User;

public class LoginImplementation implements Login{
	Scanner sc = new Scanner(System.in);

    private static final Logger logger = Logger.getLogger(LoginImplementation.class);
	
	public boolean adminLogin(String username,String password) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		int loggoff=0;
		do {
			Statement stms=con.createStatement();
			ResultSet rs = stms.executeQuery("select * from User");
			
			if(rs.next()) {
				if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					return true;
				}
				else {
					return false;
				}
			}

			}while(loggoff==1);
		return false;
	}

	@Override
	public User getUser(User u) {
		Connection con=null;
		con=DatabaseConnection.getConnection();
		try {
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("Select * from User");
			while(rs.next())
			{
				if(u.getUsername().equals(rs.getString(1))&& u.getPassword().equals(rs.getString(2))) {
					u.setUsername(rs.getString(1));
					u.setPassword(rs.getString(2));
					u.setPassword(rs.getString(3));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {}
		return u;
	}
		
}
