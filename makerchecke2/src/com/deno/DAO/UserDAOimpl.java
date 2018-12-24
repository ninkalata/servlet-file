package com.deno.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.NewUser;
import com.demo.util.DbUtil;



public class UserDAOimpl implements UserDAO {

	private Connection connection;

	public UserDAOimpl() {
		connection = DbUtil.getConnection();
	}
	@Override
	public void addNewUser( NewUser NewUser ) {
		try {
			
		//	String customerId;
			PreparedStatement pre =connection.prepareStatement("insert into temp_ninmasercustomer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		      pre.setString(2,NewUser.getCustomerName() );
		      pre.setString(3, NewUser.getCustomerAddress1());
		      pre.setString(4,NewUser.getCustomerAddress2() );
		      pre.setString(5,NewUser.getCustomerPinCode());
		      pre.setString(6, NewUser.getEmailaddress());
		      pre.setString(7,NewUser.getContactNumber() );
		      pre.setString(8,NewUser.getPrimaryContactPerson() );
		      pre.setString(9, NewUser.getRecordStatus());
		      pre.setString(10,NewUser.getActiveInactiveFlag() );
		      pre.setString(11,NewUser.getCreateDate());
		      pre.setString(12,NewUser.getCreatedBy());
		      pre.setString(13,NewUser.getModifiedDate() );
		      pre.setString(14,NewUser. getModifiedBy());
		      pre.setString(15,NewUser.getAuthorizedDate() );
		      pre.setString(16,NewUser.getAuthorizedBy());
			pre.executeUpdate();
			pre.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void deleteNewUser( String customerCode ) {
	
		try {
			PreparedStatement pre = connection.prepareStatement("delete from temp_ninmasercustomer where customerCode=?");
			pre.setString(1,customerCode );
			pre.executeUpdate();
			pre.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void updateNewUser(NewUser NewUser ) {
		try {
			String query = "update temp_ninmasercustomer set customerCode=?, customerName=?, customerAddress1=?, customerAddress2=? ,customerPinCode=?,emailaddress=?,contactNumber=?,primaryContactPerson=?,recordStatus=?,activeInactiveFlag=?,createDate=?,createdBy=?,modifiedDate=?,modifiedBy=?,authorizedDate=?,authorizedBy=? where customerCode=?";
			PreparedStatement pre = connection.prepareStatement( query );
			 pre.setString(1,NewUser.getCustomerCode());
		      pre.setString(2,NewUser.getCustomerName() );
		      pre.setString(3, NewUser.getCustomerAddress1());
		      pre.setString(4,NewUser.getCustomerAddress2() );
		      pre.setString(5,NewUser.getCustomerPinCode());
		      pre.setString(6, NewUser.getEmailaddress());
		      pre.setString(7,NewUser.getContactNumber() );
		      pre.setString(8,NewUser.getPrimaryContactPerson() );
		      pre.setString(9, NewUser.getRecordStatus());
		      pre.setString(10,NewUser.getActiveInactiveFlag() );
		      pre.setString(11,NewUser.getCreateDate());
		      pre.setString(12,NewUser.getCreatedBy());
		      pre.setString(13,NewUser.getModifiedDate() );
		      pre.setString(14,NewUser. getModifiedBy());
		      pre.setString(15,NewUser.getAuthorizedDate() );
		      pre.setString(16,NewUser.getAuthorizedBy());
			pre.executeUpdate();
			pre.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<NewUser> getAllNewUser() {
		List<NewUser> users = new ArrayList<NewUser>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery( "select * from temp_ninmasercustomer" );
			while( resultSet.next() ) {
				NewUser user = new NewUser();
				user.setCustomerCode( resultSet.getString( "customerCode" )) ;
				user.setCustomerName( resultSet.getString( "customerName" )) ;
				user.setCustomerAddress1( resultSet.getString( "customerAddress1" )) ;
				user.setCustomerAddress2( resultSet.getString( "customerAddress2" )) ;
				user.setCustomerPinCode( resultSet.getString( "customerPinCode" )) ;
				user.setEmailaddress( resultSet.getString( "emailaddress" )) ;
				user.setContactNumber( resultSet.getString( "contactNumber" )) ;
				user.setPrimaryContactPerson( resultSet.getString( "primaryContactPerson" )) ;
				user.setRecordStatus( resultSet.getString( "recordStatus" )) ;
				user.setActiveInactiveFlag( resultSet.getString( "activeInactiveFlag" )) ;
				user.setCreateDate( resultSet.getString( "createDate" )) ;
				user.setCreateDate( resultSet.getString( "createBy" )) ;
				user.setModifiedDate( resultSet.getString( "modifiedDate" )) ;
				user.setModifiedBy( resultSet.getString( "modifiedBy" )) ;
				user.setAuthorizedDate( resultSet.getString( "authorizedDate" )) ;
				user.setAuthorizedBy( resultSet.getString( "authorizedBY" )) ;


				users.add(user);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	@Override
	public NewUser getNewUserByCode(String customerCode) {
		NewUser user = new NewUser();
		try {
			String query = "select * from temp_ninmasercustomer where customerCode=?";
			PreparedStatement pre = connection.prepareStatement( query );
			pre.setString(1, customerCode);
			ResultSet resultSet = pre.executeQuery();
			while( resultSet.next() ) {
				user.setCustomerCode( resultSet.getString( "customerCode" )) ;
				user.setCustomerName( resultSet.getString( "customerName" )) ;
				user.setCustomerAddress1( resultSet.getString( "customerAddress1" )) ;
				user.setCustomerAddress2( resultSet.getString( "customerAddress2" )) ;
				user.setCustomerPinCode( resultSet.getString( "customerPinCode" )) ;
				user.setEmailaddress( resultSet.getString( "emailaddress" )) ;
				user.setContactNumber( resultSet.getString( "contactNumber" )) ;
				user.setPrimaryContactPerson( resultSet.getString( "primaryContactPerson" )) ;
				user.setRecordStatus( resultSet.getString( "recordStatus" )) ;
				user.setActiveInactiveFlag( resultSet.getString( "activeInactiveFlag" )) ;
				user.setCreateDate( resultSet.getString( "createDate" )) ;
				user.setCreateDate( resultSet.getString( "createBy" )) ;
				user.setModifiedDate( resultSet.getString( "modifiedDate" )) ;
				user.setModifiedBy( resultSet.getString( "modifiedBy" )) ;
				user.setAuthorizedDate( resultSet.getString( "authorizedDate" )) ;
				user.setAuthorizedBy( resultSet.getString( "authorizedBY" )) ;

			}
			resultSet.close();
			pre.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	
	
	
	}

