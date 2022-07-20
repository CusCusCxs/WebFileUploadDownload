package com.cus.spring.files.upload.db.repository;

import java.util.Optional;

import com.cus.spring.files.upload.db.model.ERole;
import com.cus.spring.files.upload.db.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
