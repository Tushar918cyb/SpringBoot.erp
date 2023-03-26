package com.spring.erp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ApiHome {

	@Autowired
	private HomeService homeService;
	
	@GetMapping("/home-page")
	
	
	public List<Home> getAllList(){
		return this.homeService.getList();
	}
	
	@RequestMapping("single-list/{id}")
	public Home getDetailById(@PathVariable String id) {
		return this.homeService.getDataById(id);
	}
	
	
	@GetMapping("/test")
	public Home mytest() {
		Home hm = new Home();
		hm.setDetail("jdbchdscdsbv");
		hm.setId("TEST");
		return hm;
	}
	
	
	@PostMapping("/add")
	//@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Home addData(@RequestBody Home home) {
			this.homeService.addDetail(home);
			return home;
		}
	
	@DeleteMapping("/delete/{homeId}")
	public void deleteData(@PathVariable("homeId")String id) {
		System.out.println(id);
	}
	
	@PutMapping("update/{id}")
	public Home updateRecord(@RequestBody Home home,@PathVariable String id) {
		System.out.println(id);
		return home;
	}
}
