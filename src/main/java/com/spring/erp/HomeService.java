package com.spring.erp;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class HomeService {

	private List<Home> basicDetail = new ArrayList<Home>(
				Arrays.asList(
						new Home("Java","Spring Boot","All Spring Detail"),
						new Home("React","React JS","All React JS")
						)
			);
	
	
	public List<Home>getList(){
		return basicDetail;
	}
	
	public Home getDataById(String id) {
		Home mylist= null;
		mylist = basicDetail.stream().filter(ob ->ob.getId().equals(id)).findFirst().get();
		return mylist;
	}
	
	public void addDetail(Home home) {
		basicDetail.add(home);
	}


}
