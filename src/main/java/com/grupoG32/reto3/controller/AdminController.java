package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.AdminDbo;
import com.grupoG32.reto3.model.AdminModel;
import com.grupoG32.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;
    @GetMapping("/all")
    public List<AdminModel> obtenerAdministradores(){
        //return adminService.obtenerAdministradores();
        return null;
    }
    @PostMapping("/save")
    public String crearAdministradores(@RequestBody AdminDbo adminDbo){
        //return adminService.crearAdministradores(adminDbo);
        return null;
    }
}
