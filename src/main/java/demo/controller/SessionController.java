package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Session;

@RestController
public class SessionController {

	@RequestMapping("/session")
	public Session currentSession() {
		return new Session();
	}

}
