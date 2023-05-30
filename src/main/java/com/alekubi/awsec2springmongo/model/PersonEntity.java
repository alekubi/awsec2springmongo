package com.alekubi.awsec2springmongo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonEntity {

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Age")
  private Integer age;
}
