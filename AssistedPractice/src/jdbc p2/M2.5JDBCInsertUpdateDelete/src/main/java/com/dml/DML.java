package com.dml;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DML")
public class DML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException {

		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dburl"),
					context.getInitParameter("dbuser"), context.getInitParameter("dbpassword"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (Statement statement = connection.createStatement();) {
			
			//select database
			String query1 = "use wholesaler";
			System.out.println("Query being executed: " + query1);
			statement.executeUpdate(query1);
			//insert into table
			String query4 = ("insert into eproduct (name, price, date_added) values ('New Product', 17800.00, now())");
			System.out.println("Query being executed: " + query4);
			statement.executeUpdate(query4);
			String query6 = ("insert into eproduct (name, price, date_added) values ('old Product', 10800.00, now())");
			System.out.println("Query being executed: " + query6);
			statement.executeUpdate(query6);
			//update row
			String query5 = ("update eproduct set price=2000 where name = 'New Product'");
			System.out.println("Query being executed: " + query5);
			statement.executeUpdate(query5);
			//delete row
			String query7 = ("delete from eproduct where name = 'New Product'");
			System.out.println("Query being executed: " + query7);
			statement.executeUpdate(query7);
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
