package userlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entityclasses.*;
import util.HibernateSessionUtil;

@WebServlet("/ticket")
public class ticket extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession ss=request.getSession(false);
		if(ss!=null) {
		
		try {
			// 1. build hibernate session factory
			SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
			
			// 2. create session object
			Session session = factory.openSession();
			
			Date date = new Date();
		    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		    String str = formatter.format(date);
			
			// 3. read products
			List<user> obj = session.createQuery("from user").list();
			String n="";
			int flag=0;
			for(user p : obj) {
				if(ss.getAttribute("usersid").equals(p.getId())) {
					n=p.getName();
				}
			}
			out.print("<html><body>");
			out.print("<center><h1 style=\"color:green\">CONGRATULATIONS!</h1>"
					+ "</center>\n" + "<center><h2 style=\"color:green\">Your booking is confirmed.</h2>"
					+ "</center>\n" + 
					"  <img style=\"border-radius: 5px 5px 0 0;width:35%;margin-left:50px;\" src=\"https://img.freepik.com/premium-vector/flying-airplane-icon-air-force-symbol-flight-sign-isolated-white-background_445292-153.jpg?w=2000\" alt=\"Avatar\">\n" + 
					"  <div style=\"padding: 2px 16px;\">\n");
			
			out.print("<center><h4><b> BOOKED BY - "+n+"</b></h4> \n" + 
			"<h4><b> BOOKING ID - "+ss.getAttribute("usersid")+"</b></h4>"+
			"<h4><b> AIRLINES - "+ss.getAttribute("flightname")+"</b></h4>"+
					"<h4 style='color:green;'><b> From - "+ss.getAttribute("sourceplace")+" ||  To - "+ss.getAttribute("destinationplace")+"</b></h4>"+
					"<h4 style='color:green;'><b> Date of booking - "+str+"</b></h4>"+
					"    <p>Thank you for choosing us!</p> </center>\n" + 
					"  </div>\n" + 
					"</div>\n" + 
					"</center>");
			out.print("</body></html>");
			session.close();
		} catch (Exception e) {
			out.print("<h3 style='color:red'> Hibernate session is failed ! "+e+"</h3>");
		}
		}
	}
}