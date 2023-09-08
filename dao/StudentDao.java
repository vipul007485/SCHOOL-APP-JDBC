package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {

	HelperClass helperClass = new HelperClass();

	Connection connection = null;

	public boolean deleteStudent(int id) {

		connection = helperClass.getConnection();
		String sql = "DELETE FROM student WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// Pass the value
			preparedStatement.setInt(1, id);

			// execute
			int i = preparedStatement.executeUpdate();

			if (i > 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean updateStudent(int id) {
		connection = helperClass.getConnection();
		String sql = "UPDATE student SET name ='vipul' WHERE ID = ?";
		try {
			// create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			int i = preparedStatement.executeUpdate();

			if (i > 0) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;

	}

	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";

		try {
			// create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values of delimiters/placeholders --->?

			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			// Execute
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;

	}

	public int getStudent(int id) {
		connection = helperClass.getConnection();
		String sql = "SELECT * FROM student WHERE ID=?";

		try {
			// create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values of delimiters/placeholders --->?
			preparedStatement.setInt(1, id);
//		 preparedStatement.setInt(1, student.getId());
//     	 preparedStatement.setString(2, student.getName());
//		 preparedStatement.setString(3, student.getEmail()); 
			// Execute
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;
	}

	public void GetAllStudent() {

		connection = helperClass.getConnection();

		String sql = "SELECT * FROM student";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
