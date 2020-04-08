package com.joaozin.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaozin.workshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
