package com.eurekaclient.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@RestController
public class TestDeployment {
	
	
	@GetMapping("/testdeployment")
	@JsonProperty("deploymentSuccess")
	public String deployToJenkins() {
		return "JENKINS DEPLOYMENT SUCCESS";
	}

}
