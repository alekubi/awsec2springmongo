package com.alekubi.awsec2springmongo.controller;

import com.alekubi.awsec2springmongo.model.PersonEntity;
import com.alekubi.awsec2springmongo.repository.MongoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  private final MongoRepository mongoRepository;

  @Autowired
  public MainController(MongoRepository mongoRepository) {
    this.mongoRepository = mongoRepository;
  }

  @GetMapping("/getall")
  public String getAll() {
    mongoRepository.safeEntityTest();
    List<PersonEntity> entityList = mongoRepository.getAll();
    List<String> outboundList = new ArrayList<>();
    for (PersonEntity person : entityList) {
      outboundList.add("Name: " + person.getName() + ", Alter: " + person.getAge());
    }
    return String.join(",", outboundList);
  }
}
