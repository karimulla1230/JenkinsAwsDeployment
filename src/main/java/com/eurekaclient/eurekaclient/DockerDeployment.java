package com.eurekaclient.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDeployment {
	
	@GetMapping("/dockerdeployment")
	public String successDeployment() {
		return "Successfully Deployed the Docker Application";
	}

}
