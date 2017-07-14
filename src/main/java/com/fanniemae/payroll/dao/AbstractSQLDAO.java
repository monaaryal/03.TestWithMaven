package com.fanniemae.payroll.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public abstract class AbstractSQLDAO {

	private BasicDataSource ds = new BasicDataSource();

	
	private Statement stmt = null;
	private ResultSet rs = null;

	{

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("hexaware");
		ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false");

	}

	public void insert(String sqlStatement) {

		// try catch resource

		try (Connection con = ds.getConnection();) {

			stmt = con.createStatement();
			stmt.executeUpdate(sqlStatement);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void process(String sqlStatement) {
		try (Connection con = ds.getConnection();) {

			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlStatement);

			while (rs.next() == true) {
				result(rs);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected abstract void result(ResultSet rs) throws SQLException;

}
