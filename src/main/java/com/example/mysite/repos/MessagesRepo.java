package com.example.mysite.repos;

import com.example.mysite.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessagesRepo extends CrudRepository<Message, Integer> {
}
