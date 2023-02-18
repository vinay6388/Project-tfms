package com.revature.service;

import java.sql.SQLException;

import com.revature.model.User;

public interface Login {
	public abstract boolean adminLogin(String username,String Password) throws SQLException;
	public abstract User getUser(User u);
}
