package com.example.demo;

import org.springframework.boot.SpringApplication; import org.springframework.boot.autoconfigure.SpringBootApplication; import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication public class DemoApplication { public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args); } }

@RestController @RequestMapping("/users") class UserController { private final Map<Integer, String> users = new HashMap<>(); private int currentId = 1;

@PostMapping
public String addUser(@RequestParam String name) {
    users.put(currentId, name);
    return "User added with ID: " + (currentId++);
}

@GetMapping
public Map<Integer, String> getUsers() {
    return users;
}

@GetMapping("/{id}")
public String getUser(@PathVariable int id) {
    return users.getOrDefault(id, "User not found");
}

}

