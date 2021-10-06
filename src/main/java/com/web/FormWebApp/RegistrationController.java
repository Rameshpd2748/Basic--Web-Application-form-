package com.web.FormWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.FormWebApp.dao.UserRepo;

@Controller
public class RegistrationController {
	
	  @Autowired
	  UserRepo repo; //dont need to instantiate..SPRINGBOOT PROVIDE THIS BEAUTY CONCEPT TO MAKE AUTOWIRED
	 
	@RequestMapping("/regform")
   public String register() {
	   return "registration";
   }
	
//	@RequestMapping("/userDetail")
//	   public ModelAndView userInfo(Userinformation info) {
////		System.out.println("Details loading.... "+info.getUsrName());
//		
//		ModelMap model=new ModelMap();
//		model.addAttribute("name", info.getUsrName());
//		model.addAttribute("email", info.getUsrEmail());
//		model.addAttribute("password", info.getPassword());
//		model.addAttribute("gender", info.getGender()==Integer.parseInt("1")?"Male":"Female");
//		model.addAttribute("hobbies", info.getHobby());
//		
//		ModelAndView mv=new ModelAndView("userDetails");
//		mv.addObject("regObj", model);
//		   return mv;
//	   }
		     
	     //save the entered data into H2 database
	@RequestMapping("/userDetail")
	   public String userInfo1(Userinformation info) {
		repo.save(info); //saved into h2 database
		return "operations";
		
	}
	      //find the all details of a user using only from ID
	@RequestMapping("/operation-details")
	   public ModelAndView operations(Long UID,String flag){
		         //perform operation based on User ID
		
		    if(flag.equals("Select")) {
		    	Userinformation info=repo.findById(UID).orElse(new Userinformation());
		    	System.out.println(flag); //printing operation task name on console
		    	return selectRecords(info);
		    }
		    else if(flag.equals("Delete")) {
		    	Userinformation info=repo.findById(UID).orElse(new Userinformation());
		    	System.out.println(flag);//printing operation task name on console
		    	repo.deleteById(UID); //deleted forom tabe H2 database
		    	return deleteRecords(info);
		    }
            else if(flag.equals("Update")) {
            	Userinformation info=repo.findById(UID).orElse(new Userinformation());
            	System.out.println(flag); //printing operation task name on console
            	info.setUsrName("userNameChangedWhose:"+UID); //here i only updated name but u can many more
            	repo.save(info); //after updating ,must be saved again
            	return updateRecords(info);
		    }
		    
		  //for custom selector
//            else { 
//            	System.out.println(repo.selectOrderUsrName("naresh"));
//            }
		   return new ModelAndView("userDetails");
	 }
	    
	      //select operation
	public ModelAndView selectRecords(Userinformation info) {
	
		ModelAndView mv=new ModelAndView("userDetails");
		mv.addObject("regObj", modelMapFun(info));
		return mv;
	}  
	
	     //deletes operation
	public ModelAndView deleteRecords(Userinformation info) {
		
		ModelAndView mv=new ModelAndView("deleted");
		mv.addObject("regObj", modelMapFun(info));
		return mv;
	}
	 //update operation
	public ModelAndView updateRecords(Userinformation info) {
		
		ModelAndView mv=new ModelAndView("updates");
		mv.addObject("regObj", modelMapFun(info));
		return mv;
	}
	            //modelMapp function wrte here to increase code readability
	public ModelMap modelMapFun(Userinformation info) {
		  
		  ModelMap model=new ModelMap();
			model.put("UID", info.getUID());  //u can either write put() or addAttribute() method
			model.put("name", info.getUsrName());
			model.put("email", info.getUsrEmail());
			model.put("password", info.getPassword());
			model.put("gender", info.getGender()==Integer.parseInt("1")?"Male":"Female");
			model.put("hobbies", info.getHobby());
			model.put("message",info.getMessage());
			return model;
	  }
	
}
