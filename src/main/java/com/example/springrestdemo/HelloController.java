package com.example.springrestdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public GreetingResponse hello() {
        return new GreetingResponse(
                "Hello World!",
                LocalDateTime.now()
        );
    }

    @GetMapping("/greet/{name}")
    public GreetingResponse greet(@PathVariable String name) {
        return new GreetingResponse(
                "Hello " + name + "world",
                LocalDateTime.now()
        );

    }

    public class GreetingResponse {

        private String message;
        private LocalDateTime timestamp;

        public GreetingResponse(String message, LocalDateTime timestamp) {
            this.message = message;
            this.timestamp = timestamp;
        }

        public GreetingResponse() {
        }

        //hej

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }
    }
}