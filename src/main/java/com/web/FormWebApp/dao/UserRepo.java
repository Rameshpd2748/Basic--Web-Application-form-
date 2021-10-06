package com.web.FormWebApp.dao;

//import org.springframework.data.jpa.repository.JpaRepository;  //this is advanced features than crudrepository
import org.springframework.data.repository.CrudRepository;

import com.web.FormWebApp.Userinformation;

public interface UserRepo extends CrudRepository<Userinformation,Long> { //CrudRepository<Userinformation,Long> also u can use
	 
//	@Query("from myEntity where lower(UsrName)=lower('Ramesh') order by UID desc") //@Param("username") 
//     List<Userinformation> selectOrderUsrName(String name); //for custom operation
}
