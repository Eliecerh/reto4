package com.grupoG32.reto3.service;

import com.grupoG32.reto3.dbo.MessageDbo;
import com.grupoG32.reto3.model.MessageModel;
import com.grupoG32.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> obtener(){
        return messageRepository.findAll();
    }

    public void crear(MessageModel message){
        messageRepository.save(message);
    }
    public void eliminar(int id){
        messageRepository.deleteById(id);
    }
    public void actualizar(MessageDbo messageInput){
        Optional<MessageModel> messageDB = messageRepository.findById(messageInput.getIdMessage());

        if(messageDB.isPresent()){
            MessageModel message = messageDB.get();

            if(messageInput.getMessageText() != null){
                message.setMessageText(messageInput.getMessageText());
            }
            if(messageInput.getCar() != null){
                message.setCar(messageInput.getCar());
            }
            if(messageInput.getClient() != null){
                message.setClient(messageInput.getClient());
            }
            messageRepository.save(message);
        }

    }
}
