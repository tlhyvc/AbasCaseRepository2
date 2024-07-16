package com.example.demo.service;

import com.example.demo.model.Siparis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiparisRepository extends JpaRepository<Siparis, Long> {
}
