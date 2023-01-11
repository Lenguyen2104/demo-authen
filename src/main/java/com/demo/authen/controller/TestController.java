package com.demo.authen.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

	@RequestMapping(method = RequestMethod.GET, value = "/authen/")
	public String getTokenDetails(@RequestHeader HttpHeaders headers) {
		return headers.toString();
	}

	@GetMapping("/name")
	public String youname() {
		return "my name nguyen";
	}
}
