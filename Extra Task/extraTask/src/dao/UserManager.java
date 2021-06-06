package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import model.User;

public class UserManager {

	Connection conn;
	Statement statement;
	ResultSet resultSet;

	public UserManager() {
		// TODO Auto-generated constructor stub
		conn = DB_connection.getConnection();
	}

	public User getUserByEmail(String email) {

		System.out.println("email:" + email);
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery("Select * from user where email = '" + email + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		User user = null;
		try {
			while (resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt("id"));
				user.setEmail(resultSet.getString("email"));
				user.setName(resultSet.getString("name"));
				user.setName(resultSet.getString("password"));
				user.setQ1(resultSet.getString("q1"));
				user.setQ2(resultSet.getString("q2"));
				user.setQ3(resultSet.getString("q3"));
				user.setQ4(resultSet.getString("q4"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public boolean insert(User user) {
		try {
			statement = conn.createStatement();

			int result = statement
					.executeUpdate("INSERT into user ('name','email','password','q1','q2','q3','q4') values('"
							+ user.getName() + "','" + user.getEmail() + "','" + user.getPassword() + "','"
							+ user.getQ1() + "','" + user.getQ2() + "','" + user.getQ3() + "','" + user.getQ4() + "')");
			if (result > 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public String generatePassword() {

		StringBuilder builder = new StringBuilder();
		String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";

		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(alphanumeric.length());

			builder.append(alphanumeric.charAt(index));

		}
		return builder.toString();

	}

	public User getUserById(int id) {

		System.out.println("email:" + id);
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery("Select * from user where id = '" + id + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		User user = null;
		try {
			while (resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt("id"));
				user.setEmail(resultSet.getString("email"));
				user.setName(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setQ1(resultSet.getString("q1"));
				user.setQ2(resultSet.getString("q2"));
				user.setQ3(resultSet.getString("q3"));
				user.setQ4(resultSet.getString("q4"));
				System.out.println(user.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public User updatePassword(String password, int id) {

		try {
			statement = conn.createStatement();

			statement.executeUpdate("Update user set password='" + password + "' where id=" + id + "");
			return getUserById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
