package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.MessageDbo;
import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.model.MessageModel;
import com.grupoG32.reto3.service.AdminService;
import com.grupoG32.reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;
    @GetMapping("/all")
    public List<MessageModel> obtener(){
        return messageService.obtener();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody MessageModel mensaje){
        messageService.crear(mensaje);
    }
}
