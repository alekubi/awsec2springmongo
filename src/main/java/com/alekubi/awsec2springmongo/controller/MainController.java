package com.alekubi.awsec2springmongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/hello")
  public String insertRecord() {
    return "Hello!";
  }
}
