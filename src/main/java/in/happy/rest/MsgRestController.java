package in.happy.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contect")
	public String contect() {
		return "6203332535";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi how are you";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hi how are you";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Namaste";
	}
	
}
