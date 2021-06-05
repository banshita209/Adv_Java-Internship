package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Student;

public class StudentManagement {

	Connection conn;
	Statement statement;
	ResultSet resultSet;

	public StudentManagement() {
		conn = DB_connection.getConnection();

	}

	public boolean insert(Student student) {

		try {
			statement = conn.createStatement();

			int result = statement.executeUpdate(
					"INSERT into STUDENT (`name`,`college`,`branch`,`semester`,`contact`,`email`,`password`) values('"
							+ student.getName() + "','" + student.getCollege() + "','" + student.getBranch() + "','"
							+ student.getSemester() + "','" + student.getContact() + "','" + student.getEmail() + "','"
							+ student.getPassword() + "')");
			if (result > 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Student getStudentbyEmail(String email) {
		Student student = new Student();
		try {
			System.out.println("email:" + email);
			statement = conn.createStatement();
			resultSet = statement.executeQuery("Select * from Student where email = '" + email + "'");

			while(resultSet.next()) {

				System.out.println(resultSet.getString("name"));

				student.setId(resultSet.getInt("id"));
				student.setName(resultSet.getString("name"));
				student.setCollege(resultSet.getString("college"));
				student.setBranch(resultSet.getString("branch"));
				student.setSemester(resultSet.getInt("semester"));
				student.setContact(resultSet.getLong("contact"));
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
}
