package com.consuma.appblog;

import com.consuma.appblog.model.MessageRetrival;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<MessageRetrival,String> {
}
