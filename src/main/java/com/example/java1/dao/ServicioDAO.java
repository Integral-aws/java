package com.example.java1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java1.model.Vegetal;

public interface ServicioDAO extends JpaRepository<Vegetal, Integer> {

}
