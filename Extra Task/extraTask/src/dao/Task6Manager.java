package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Marks;
import model.Student;

public class Task6Manager {
	Connection conn;
	Statement statement;
	ResultSet resultSet;

	public Task6Manager() {
		// TODO Auto-generated constructor stub
		conn = DB_connection.getConnection();
	}

	public Student getUserByEmail(String email) {

		System.out.println("email:" + email);
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery("Select * from student where email = '" + email + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student student = null;
		try {
			while (resultSet.next()) {

				student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setName(resultSet.getString("name"));

				student.setEmail(resultSet.getString("email"));
				student.setPassword(resultSet.getString("password"));

				System.out.println("student object :" + student.toString());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	public String checkPassOrNot(Marks marks) {

		if (marks.getPercentage() > 33) {
			return "pass";
		}
		return "fail";
	}

	public boolean insert(Marks marks) {
		try {
			statement = conn.createStatement();

			int result = statement.executeUpdate(
					"INSERT into marks (`s1`,`s2`,`s3`,`s4`,`s5`,`s6`,`s7`,`avg`,`percent`,`name`) values('"
							+ marks.getS1() + "','" + marks.getS2() + "','" + marks.getS3() + "','" + marks.getS4()
							+ "','" + marks.getS5() + "','" + marks.getS6() + "','" + marks.getS7() + "','"
							+ marks.getAvg() + "','" + marks.getPercentage() + "','" + marks.getName() + "')");
			if (result > 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
