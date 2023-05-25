package com.consuma.appblog.contoller;

import com.consuma.appblog.MessageRepository;
import com.consuma.appblog.model.MessageRetrival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    MessageRepository repo;
    @GetMapping("/message")
    public List<MessageRetrival> getAllMessage() {
        return repo.findAll();
    }
    @PostMapping("/addmessage")
    public MessageRetrival addMessage(@RequestBody MessageRetrival addmessage){
        return repo.save(addmessage);
    }
}
