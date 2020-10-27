package com.spring.mongo.repositories;

import com.spring.mongo.model.Login;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by prkumar on 18/10/2020.
 */

@Repository("loginRepository")
public interface LoginRepository extends MongoRepository<Login, ObjectId> {
    public Login getUserByUserName(String userName);
}
