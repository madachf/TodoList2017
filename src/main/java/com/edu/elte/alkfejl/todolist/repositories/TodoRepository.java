package com.edu.elte.alkfejl.todolist.repositories;

import com.edu.elte.alkfejl.todolist.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}