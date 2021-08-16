/**
 *
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Pipe! Hello Pipe!";
	}

}
