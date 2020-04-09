package com.example.java1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java1.dto.VegetalDTO;
import com.example.java1.model.Vegetal;
import com.example.java1.service.IServicioBO;

@RestController
public class EntradaServicio {
	
	@Autowired
	private IServicioBO iServicioBO;

	@GetMapping("serv")
	public ResponseEntity<VegetalDTO> servicio() {
		VegetalDTO vegetalDTO = new VegetalDTO();
		try {
			vegetalDTO.setError(false);
			vegetalDTO.setMensaje("Transacción exitosa");
			vegetalDTO.setVegetales(iServicioBO.obtenerVegetales());
			return new ResponseEntity<VegetalDTO>(vegetalDTO, HttpStatus.OK);
		}catch(Exception e) {
			vegetalDTO.setError(true);
			vegetalDTO.setMensaje("Error en servicio: "+e.getMessage());
			return new ResponseEntity<VegetalDTO>(vegetalDTO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
