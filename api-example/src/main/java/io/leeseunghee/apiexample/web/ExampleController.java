package io.leeseunghee.apiexample.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ExampleController {

	@GetMapping
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok("Success message");
	}
}
