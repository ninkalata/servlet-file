package com.deno.DAO;


import java.util.List;

import com.demo.model.NewUser;
;

	public interface UserDAO {
		public void addNewUser( NewUser NewUser );
		public void deleteNewUser( String customerCode );
		public void updateNewUser( NewUser NewUser );
		public List<NewUser> getAllNewUser();
		public NewUser getNewUserByCode( String customerCode );
	}


