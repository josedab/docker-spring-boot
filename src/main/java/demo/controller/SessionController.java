package demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import demo.model.Session;

@Api(value = "/session")
@RequestMapping("/session")
@RestController
public class SessionController {
    
    private static final Logger logger = LoggerFactory.getLogger(SessionController.class);
    
    @ApiOperation(value = "New session", notes = "Just a new session")
	@RequestMapping(method=RequestMethod.GET, value="/new")
	public Session currentSession() {
        logger.info("Requested new session");
		return new Session();
	}

}
