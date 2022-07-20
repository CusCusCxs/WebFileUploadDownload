package com.cus.spring.files.upload.db.repository;

import java.util.Optional;

import com.cus.spring.files.upload.db.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
