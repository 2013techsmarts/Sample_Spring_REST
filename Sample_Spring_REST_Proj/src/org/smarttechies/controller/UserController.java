package org.smarttechies.controller;

import org.smarttechies.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("/user")
public class UserController {

	@RequestMapping(value="/{screenName}", method = RequestMethod.GET,  headers="Accept=*/*")
	@ResponseBody
	public User getUser(@PathVariable String screenName) {
		
		//Send request to API or DAO layer to get the user information
		User user = new User();
		user.setFirstName("Robyn Rihanna");
		user.setLastName("Fenty");
		user.setSelfDescription("Unapologetic, new album out now worldwide http://smarturl.it/UnapologeticDlx  Download 'Stay' http://smarturl.it/RihannaStay 777 Tour DVD Available NOW http://amzn.to/13rkPEU LA BABY! · rihannanow.com");
		user.setAvatar("https://si0.twimg.com/profile_images/3096110144/d097a719dba080cc99ca9dbfba85dfa4.jpeg");
		user.setUserId("rihanna");
		return user;
	}
	
}
