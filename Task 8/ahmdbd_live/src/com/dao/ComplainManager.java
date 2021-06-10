package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Complain;

public class ComplainManager {
	Connection conn;
	Statement statement;
	ResultSet resultSet;

	public ComplainManager() {
		conn = DB_connection.getConnection();

	}

	public boolean insert(Complain complain) throws SQLException {

		statement = conn.createStatement();

		int result = statement.executeUpdate(
				"INSERT into complain (`title`,`description`,`address`,`contact`,`user`,`isactive`) values('"
						+ complain.getTitle() + "','" + complain.getDescription() + "','" + complain.getAddress()
						+ "','" + complain.getContact() + "','" + complain.getUser() + "','" + complain.getIsActive()
						+ "')");
		if (result > 0) {
			System.out.println("result =" + result);
			return true;
		}

		return false;
	}

	public ArrayList<Complain> findAllComplainsByUserID(int id) throws SQLException {

		statement = conn.createStatement();

		resultSet = statement.executeQuery("select * from complain where user='" + id + "' and isactive='" + 1 + "'");
		ArrayList<Complain> complains = null;

		complains = getComplainListByResultSet(resultSet);

		return complains;

	}

	public Complain getComplainsByID(int id, int userid) throws SQLException {

		statement = conn.createStatement();

		resultSet = statement.executeQuery(
				"select * from complain where id='" + id + "' and user='" + userid + "' and isactive='" + 1 + "'");
		Complain complain = null;
		while (resultSet.next()) {
			complain = getComplainsByResultSet(resultSet);
		}

		return complain;

	}

	public Complain getComplainsByResultSet(ResultSet rs) throws SQLException {

		Complain complain = new Complain();

		complain.setId(rs.getInt("id"));
		complain.setTitle(rs.getString("title"));
		complain.setDescription(rs.getString("description"));
		complain.setAddress(rs.getString("address"));
		complain.setContact(rs.getLong("contact"));
		complain.setUser(rs.getInt("user"));

		return complain;

	}

	public ArrayList<Complain> getComplainListByResultSet(ResultSet rs) throws SQLException {

		ArrayList<Complain> complains = new ArrayList<>();
		while (rs.next()) {
			complains.add(getComplainsByResultSet(rs));
		}
		return complains;
	}

	public boolean updateComplain(Complain complain) throws SQLException {

		statement = conn.createStatement();
		int result = statement.executeUpdate("Update Complain Set title='" + complain.getTitle() + "', description='"
				+ complain.getDescription() + "', contact='" + complain.getContact() + "', address='"
				+ complain.getAddress() + "', isactive='" + 1 + "' where id='" + complain.getId() + "' and user='"
				+ complain.getUser() + "'");

		if (result > 0) {
			return true;
		}
		return false;
	}

	public boolean deleteComplain(int id) throws SQLException {

		statement = conn.createStatement();
		int result = statement.executeUpdate("Update Complain Set isactive='" + 0 + "' where id='" + id + "'");

		if (result > 0) {
			return true;
		}

		return false;

	}
}
