package com.demo.controller;


	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.demo.model.NewUser;
import com.deno.DAO.UserDAO;
import com.deno.DAO.UserDAOimpl;


	@WebServlet("/NewUserController")
	public class NewUserController extends HttpServlet {

		private UserDAO dao;
		private static final long serialVersionUID = 1L;
		public static final String lIST_STUDENT = "/list.jsp";
		public static final String INSERT_OR_EDIT = "/NewUser.jsp";

	    public NewUserController() {
	    	dao = new UserDAOimpl();
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String forward = "";
			String action = request.getParameter( "action" );

			if( action.equalsIgnoreCase( "delete" ) ) {
				forward = lIST_STUDENT;
				String customerCode=request.getParameter("customerCode") ;
				dao.deleteNewUser(customerCode);
				request.setAttribute("users", dao.getAllNewUser() );
			}
			else if( action.equalsIgnoreCase( "edit" ) ) {
				forward = INSERT_OR_EDIT;
				String customerCode=request.getParameter("customerCode") ;	
				NewUser user = dao.getNewUserByCode(customerCode);
				request.setAttribute("user", user);
			}
			else if( action.equalsIgnoreCase( "insert" ) ) {
				forward = INSERT_OR_EDIT;
			}
			else {
				forward = lIST_STUDENT;
				request.setAttribute("students", dao.getAllNewUser() );
			}
			RequestDispatcher view = request.getRequestDispatcher( forward );
			view.forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			NewUser user = new NewUser();
		 
			user.setCustomerCode(request.getParameter("customerCode"));  
			user.setCustomerName(request.getParameter("customerName"));  
			user.setCustomerAddress1 (request.getParameter("customerAddress1"));  
	      user.setCustomerAddress2(request.getParameter("customerAddress2"));  
	 user.setCustomerPinCode(request.getParameter("customerPinCode"));  
	     user.setEmailaddress(request.getParameter("emailaddress"));  
	      user.setContactNumber(request.getParameter("contactNumber"));  
	   user.setPrimaryContactPerson(request.getParameter("primaryContactPerson"));  
	   user.setRecordStatus ( request.getParameter("recordStatus"));  
	   user.setActiveInactiveFlag (request.getParameter("activeInactiveFlag"));  
	      user.setCreateDate (request.getParameter("createDate"));  
	     user.setCreatedBy(request.getParameter("createdBy"));  
	     user.setModifiedDate( request.getParameter("modifiedDate"));  
	     user.setModifiedBy(request.getParameter("modifiedBy"));  
	     user.setAuthorizedDate(request.getParameter("authorizedDate"));  
	     user.setAuthorizedBy( request.getParameter("authorizedBy"));  
	    
			String customerCode = request.getParameter("customerCode");

			if( customerCode == null || customerCode.isEmpty() )
				dao.addNewUser(user);
			else {
				user.setCustomerCode( customerCode );
				dao.updateNewUser(user);
			}
			RequestDispatcher view = request.getRequestDispatcher( lIST_STUDENT );
			request.setAttribute("users", dao.getAllNewUser());
			view.forward(request, response);
		}
	}



