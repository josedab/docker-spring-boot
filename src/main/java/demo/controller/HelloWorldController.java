package demo.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String home() {
		return "Hello World";
	}

	@RequestMapping("/helloTime")
	public String helloTime() {
		return "Hello World. It is " + Calendar.getInstance().getTime();
	}
}
