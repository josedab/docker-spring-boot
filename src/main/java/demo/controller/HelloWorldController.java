package demo.controller;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "/hello")
@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @ApiOperation(value = "Worldify the hello", 
                  notes = "Just a hello world")
    @RequestMapping(method = RequestMethod.GET, value = "/world")
    public String home() {
        return "Hello World";
    }

    @ApiOperation(value = "Timify the hello", 
                  notes = "Just a helloworld with the time")
    @RequestMapping(method = RequestMethod.GET, value = "/time")
    public String helloTime() {
        return "Hello World. It is " + Calendar.getInstance().getTime();
    }
}
