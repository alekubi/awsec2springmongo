package com.alekubi.awsec2springmongo.repository;

import com.alekubi.awsec2springmongo.model.PersonEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepository {

  private final MongoTemplate mongoTemplate;

  @Autowired
  public MongoRepository(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }

  public void safeEntityTest() {
    PersonEntity entity1 = new PersonEntity();
    entity1.setName("Alex");
    entity1.setAge(32);
    mongoTemplate.save(entity1);
  }

  public List<PersonEntity> getAll() {
    return mongoTemplate.findAll(PersonEntity.class);
  }
}
