package com.example.demo.controller;

import com.example.demo.model.Siparis;
import com.example.demo.service.SiparisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/siparis")
public class SiparisController {

    @Autowired
    private SiparisService siparisService;

    @GetMapping
    public List<Siparis> getAllSiparis() {
        return siparisService.getAllSiparis();
    }

    @PostMapping
    public Siparis addSiparis(@RequestBody Siparis siparis) {
        return siparisService.addSiparis(siparis);
    }
}