package com.eurekaclient.eurekaclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDeployment {
	
	@GetMapping("/dockerdeployment")
	public String successDeployment() {
		return "Successfully Deployed the Docker Application";
	}
	
	@GetMapping("/jenkinscicddeployment")
	public ResponseEntity<?> addData(@RequestParam String id, @RequestParam String name) {
		
		Employee employee = new Employee();
		
		employee.setId(id);
		employee.setName(name);
		
		List<Employee> employeeLst = new ArrayList<Employee>();
		employeeLst.add(employee);
		
		return  ResponseEntity.ok("New user added in Jenkins : ===> " + employeeLst.get(0).getId() + " " + employeeLst.get(0).getName());
		
	}

}
