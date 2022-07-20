package com.cus.spring.files.upload.db.repository;


import com.cus.spring.files.upload.db.model.FileDB;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FileDBRepository extends MongoRepository<FileDB, String> {

}
