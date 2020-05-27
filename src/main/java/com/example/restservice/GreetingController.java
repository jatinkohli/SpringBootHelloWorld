package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private final AtomicLong counterWQ = new AtomicLong(1);
	private final AtomicLong counterNQ = new AtomicLong(1);

	@GetMapping("/greetingWQ")
	public Greeting greetingWithQuery(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counterWQ.getAndIncrement(), "Hello, " + name + "!");
	}

	@PostMapping("/greetingNQ")
	public Greeting greetingWithoutQuery(@RequestParam(value = "name") String name) {
		return new Greeting(counterNQ.getAndIncrement(), "Hello, " + name + "!");
	}
}