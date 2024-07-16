package com.example.demo.service;

import com.example.demo.model.Siparis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SiparisService {

    @Autowired
    private SiparisRepository siparisRepository;

    public List<Siparis> getAllSiparis() {
        return siparisRepository.findAll();
    }

    public Siparis addSiparis(Siparis siparis) {
        return siparisRepository.save(siparis);
    }
}