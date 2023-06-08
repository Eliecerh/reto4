package com.grupoG32.reto3.service;

import com.grupoG32.reto3.model.ClientModel;
import com.grupoG32.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){
        return clientRepository.findAll();
    }

    public void crear(ClientModel client){
        clientRepository.save(client);
    }
    public void eliminar(int id){
        clientRepository.deleteById(id);
    }

    public void actualizar(ClientModel clientInput) {
        Optional<ClientModel> clientDB = clientRepository.findById(clientInput.getIdClient());
        if(clientDB.isPresent()){
            ClientModel client = clientDB.get();
            if(clientInput.getAge() != null){
                client.setAge(clientInput.getAge());
            }
            if(clientInput.getName() != null){
                client.setName(clientInput.getName());
            }
            if(clientInput.getEmail() != null){
                client.setEmail(clientInput.getEmail());
            }
            if(clientInput.getPassword() != null){
                client.setPassword(clientInput.getPassword());
            }
            if(clientInput.getMessages() != null){
                client.setMessages(clientInput.getMessages());
            }
            if(clientInput.getReservations() != null){
                client.setReservations(clientInput.getReservations());
            }
            clientRepository.save(client);
        }
    }
}
